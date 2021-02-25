package br.com.zup.casadocodigo.controller;

import br.com.zup.casadocodigo.controller.response.CountryResponse;
import br.com.zup.casadocodigo.controller.request.NewCountryRequest;
import br.com.zup.casadocodigo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<CountryResponse> save(@RequestBody @Valid NewCountryRequest req, UriComponentsBuilder uriBuilder) {
        var country = countryRepository.save(req.toModel());
        URI uri = uriBuilder.path("/countries/{id}").buildAndExpand(country.getId()).toUri();
        return ResponseEntity.created(uri).body(new CountryResponse(country));
    }

    @GetMapping
    public Page<CountryResponse> list(@PageableDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pagination) {
        return countryRepository.findAll(pagination).map(CountryResponse::new);
    }

}

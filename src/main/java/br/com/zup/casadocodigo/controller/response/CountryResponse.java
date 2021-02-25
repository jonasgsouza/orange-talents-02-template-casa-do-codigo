package br.com.zup.casadocodigo.controller.response;

import br.com.zup.casadocodigo.model.Country;

public class CountryResponse {
    private Integer id;

    private String name;

    public CountryResponse(Country country) {
        this.id = country.getId();
        this.name = country.getName();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

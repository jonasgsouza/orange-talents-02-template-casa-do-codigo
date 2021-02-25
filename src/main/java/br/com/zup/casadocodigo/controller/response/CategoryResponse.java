package br.com.zup.casadocodigo.controller.response;

import br.com.zup.casadocodigo.model.Category;

public class CategoryResponse {
    private Long id;

    private String name;

    public CategoryResponse(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}

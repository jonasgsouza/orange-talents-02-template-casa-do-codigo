package br.com.zup.casadocodigo.controller.response;

import br.com.zup.casadocodigo.model.State;

public class StateResponse {
    private Long id;
    private String name;

    public StateResponse(State state) {
        this.id = state.getId();
        this.name = state.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

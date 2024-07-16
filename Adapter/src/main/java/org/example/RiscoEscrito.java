package org.example;

public class RiscoEscrito implements IRisco {

    private String descricao;

    @Override
    public String getRisco() {
        return this.descricao;
    }

    @Override
    public void setRisco(String descricao) {
        this.descricao = descricao;
    }
}


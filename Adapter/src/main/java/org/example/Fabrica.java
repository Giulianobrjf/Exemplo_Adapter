package org.example;

public class Fabrica {
    IRisco risco;
    RiscoAdapter controller;

    public Fabrica() {
        risco = new RiscoEscrito();
        controller = new RiscoAdapter(risco);
    }

    public void setRisco(String descricao) {
        risco.setRisco(descricao);
        controller.salvarRisco();
    }

    public String getRisco() {
        return controller.recuperarRisco();
    }


    public int getEscala() {
        return controller.getEscala();
    }

}

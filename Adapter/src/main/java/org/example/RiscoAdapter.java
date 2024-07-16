package org.example;

public class RiscoAdapter extends RiscoEscala {
    private IRisco riscoEscrito;

    public RiscoAdapter(IRisco riscoEscrito) {
        this.riscoEscrito = riscoEscrito;
    }

    public String recuperarRisco() {
        if (this.getEscala() >= 9)
            riscoEscrito.setRisco("Muito Alto");
        else
             if (this.getEscala() >= 7)
                 riscoEscrito.setRisco("Alto");
        else
            if (this.getEscala() >= 5)
                 riscoEscrito.setRisco("Medio");
        else
                riscoEscrito.setRisco("Baixo");
        return riscoEscrito.getRisco();
    }


    public void salvarRisco() {
        if (riscoEscrito.getRisco().equals("Muito Alto"))
            this.setEscala(9);
        else
        if (riscoEscrito.getRisco().equals("Alto"))
            this.setEscala(7);
        else
        if (riscoEscrito.getRisco().equals("Medio"))
            this.setEscala(5);
        else
            this.setEscala(0);
    }
}

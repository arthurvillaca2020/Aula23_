package org.example;

public class BoletoEmAtraso extends Boleto{
    public String verificarAtraso() {
        if (this.getDiasAtraso() >= 1) {
            return "Atrasado";
        }
        else {
            return "Em dia";
        }
    }
}

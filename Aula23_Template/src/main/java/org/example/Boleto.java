package org.example;

public abstract class Boleto {
    private int numeroBoleto;
    private int diasAtraso;
    protected String nome;
    private float valor;

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public abstract String verificarAtraso();
    public String getTipo() {
        return "Boleto";
    }
    public String getInfo() {
        return getTipo() + "{" +
                "Numero do boleto=" + this.numeroBoleto +
                ", Nome='" + this.nome + '\'' +
                ", Valor='" + this.valor + '\'' +
                ", Esta atrasado? " + this.verificarAtraso() +
                '}';
    }
}

package br.com.joaolorenco.padroes.comportamentais.visitor;

/**
 *
 * @author joao-
 */
public class Fruta implements Item {

    private String nome;
    private double peso;
    private double precoporKg;

    public Fruta(String nome, double peso, double precoporKg) {
        this.nome = nome;
        this.peso = peso;
        this.precoporKg = precoporKg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoporKg() {
        return precoporKg;
    }

    public void setPrecoporKg(double precoporKg) {
        this.precoporKg = precoporKg;
    }

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitar(this);
    }

}

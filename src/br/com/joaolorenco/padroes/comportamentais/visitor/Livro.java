package br.com.joaolorenco.padroes.comportamentais.visitor;

/**
 *
 * @author joao-
 */
public class Livro implements Item{
    
    private String titulo;
    private double preco;

    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitar(this);
    }

}

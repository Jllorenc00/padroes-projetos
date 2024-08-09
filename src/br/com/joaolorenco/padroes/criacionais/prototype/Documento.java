package br.com.joaolorenco.padroes.criacionais.prototype;

/**
 *
 * @author joao-
 */
public class Documento implements Cloneable {

    private String Titulo;
    private String Conteudo;

    public Documento(String Titulo, String Conteudo) {
        this.Titulo = Titulo;
        this.Conteudo = Conteudo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getConteudo() {
        return Conteudo;
    }

    public void setConteudo(String Conteudo) {
        this.Conteudo = Conteudo;
    }

    public Documento clone() {
        return new Documento(this.Titulo, this.Conteudo);
    }

    @Override
    public String toString() {
        return "Documento{" + "Titulo=" + Titulo + ", Conteudo=" + Conteudo + '}';
    }

}

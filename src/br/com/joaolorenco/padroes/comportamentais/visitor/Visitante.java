package br.com.joaolorenco.padroes.comportamentais.visitor;

/**
 *
 * @author joao-
 */
public interface Visitante {

    void visitar(Livro livro);

    void visitar(Fruta fruta);
}

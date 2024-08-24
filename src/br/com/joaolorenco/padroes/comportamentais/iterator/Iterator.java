package br.com.joaolorenco.padroes.comportamentais.iterator;

/**
 *
 * @author joao-
 */
public interface Iterator<T> {

    boolean temProximo();

    T proximo();
}

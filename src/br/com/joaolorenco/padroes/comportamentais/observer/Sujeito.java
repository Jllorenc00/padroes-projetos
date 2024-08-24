package br.com.joaolorenco.padroes.comportamentais.observer;

/**
 *
 * @author joao-
 */
//gerencia observador
public interface Sujeito {

    void adicionarObervador(Observer observador);

    void removeObservador(Observer observador);

    void notificaObservadores();

}

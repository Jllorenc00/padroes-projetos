package br.com.joaolorenco.padroes.comportamentais.observer;

/**
 *
 * @author joao-
 */
// define o método de notificação
public interface Observer {

    void atualizar(String nomeProduto, int quantidade);
}

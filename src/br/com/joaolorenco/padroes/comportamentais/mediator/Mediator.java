package br.com.joaolorenco.padroes.comportamentais.mediator;

/**
 *
 * @author joao-
 */
public interface Mediator {

    void enviarMensagem(String mensagem, Colaborador cobolador);
    
    void adicionarColaborador(Colaborador colaborador);
    
}


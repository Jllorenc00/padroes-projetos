package br.com.joaolorenco.padroes.comportamentais.mediator;

/**
 *
 * @author joao-
 */
public abstract class Colaborador {
    
    protected Mediator mediador;
    protected String nome;

    public Colaborador(Mediator mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
        mediador.adicionarColaborador(this);
    }
    
    public abstract void enviarMensagem(String mensagem);
    
    public abstract void receberMensagem(String mensagem);
}

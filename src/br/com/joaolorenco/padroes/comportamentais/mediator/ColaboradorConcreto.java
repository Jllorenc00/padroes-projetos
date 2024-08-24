package br.com.joaolorenco.padroes.comportamentais.mediator;

/**
 *
 * @author joao-
 */
public class ColaboradorConcreto extends Colaborador{

    public ColaboradorConcreto(Mediator mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(this.nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(this.nome + "Recebeu" + mensagem);
    }

}

package br.com.joaolorenco.padroes.comportamentais.command;

/**
 *
 * @author joao-
 */
public class ComandoLigarLuz implements Comando {

    private Luz luz;

    public ComandoLigarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }

}

package br.com.joaolorenco.padroes.comportamentais.command;

/**
 *
 * @author joao-
 */
public class ComandoDesligarLuz implements Comando {

    private Luz luz;

    public ComandoDesligarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }

}

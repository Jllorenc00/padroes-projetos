package br.com.joaolorenco.padroes.comportamentais.command;

/**
 *
 * @author joao-
 */
public class ControleRemoto {

    private Comando comando;

    void setComando(Comando comando) {
        this.comando = comando;
    }

    void pressionarBotao() {
        comando.executar();
    }
}

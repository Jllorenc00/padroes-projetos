package br.com.joaolorenco.padroes.comportamentais.command;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Luz luz = new Luz();
        Comando ligarLuz = new ComandoLigarLuz(luz);
        Comando desligarLuz = new ComandoDesligarLuz(luz);

        ControleRemoto controle = new ControleRemoto();
        //ligar a luz
        controle.setComando(ligarLuz);
        controle.pressionarBotao();

        //desligar a luz
        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }
}

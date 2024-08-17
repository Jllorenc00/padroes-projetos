package br.com.joaolorenco.padroes.comportamentais.interpreter;

/**
 *
 * @author joao-
 */
public class VirarADireita implements Comando{

    @Override
    public void executar() {
        System.out.println("Virar a Direita");
    }
}

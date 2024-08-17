package br.com.joaolorenco.padroes.comportamentais.interpreter;

/**
 *
 * @author joao-
 */
public class VirarAEsquerda implements Comando {

    @Override
    public void executar() {
        System.out.println("Virar a Esquerda");
    }
}

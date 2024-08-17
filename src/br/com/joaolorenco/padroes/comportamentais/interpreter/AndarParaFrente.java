package br.com.joaolorenco.padroes.comportamentais.interpreter;

/**
 *
 * @author joao-
 */
public class AndarParaFrente implements Comando{

    @Override
    public void executar() {
        System.out.println("Andar para frente");
    }
    
}

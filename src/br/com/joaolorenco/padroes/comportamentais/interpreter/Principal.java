package br.com.joaolorenco.padroes.comportamentais.interpreter;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        String comando = "ADEEDADAEAD";
        Interpreter inter = new Interpreter();
        inter.interpretar(comando);
    }
}

package br.com.joaolorenco.padroes.criacionais.builder;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        //Casa simples
        Casa casaSimples = new Builder().comParedes("Paredes de Tijolos").comTelhado("Telhado de Telha").build();

        System.out.println("Casa Simples");
        System.out.println("Paredes: " + casaSimples.getParedes());
        System.out.println("Telhado: " + casaSimples.getTelhado());

        Casa casaSimples1 = new Builder().comParedes("Paredes de Tijolos").comTelhado("Telhado de Telha").comJanelas("Janelas de Vidro").comPortas("Portas de Madeira").build();
        System.out.println("Casa Simples 1");
        System.out.println("Paredes: " + casaSimples1.getParedes());
        System.out.println("Telhado: " + casaSimples1.getTelhado());
        System.out.println("Janelas: " + casaSimples1.getJanelas());
        System.out.println("Portas: " + casaSimples1.getPortas());
    }
}

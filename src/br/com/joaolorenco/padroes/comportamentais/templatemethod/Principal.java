package br.com.joaolorenco.padroes.comportamentais.templatemethod;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Bebida cha = new Cha();
        System.out.println("Preparando cha");
        cha.preparar();

        Bebida cafe = new Cafe();
        System.out.println("Preparando cafe");
        cafe.preparar();
    }
}

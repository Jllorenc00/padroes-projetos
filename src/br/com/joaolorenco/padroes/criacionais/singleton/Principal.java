package br.com.joaolorenco.padroes.criacionais.singleton;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        //obter a unica instancia
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        
        singleton1.mostrarMensagem();
        singleton2.mostrarMensagem();
        
        if (singleton1 == singleton2){
            System.out.println("As instancias sao iguais");
        } else {
            System.out.println("As instancias sao diferentes");
        }
    }
}

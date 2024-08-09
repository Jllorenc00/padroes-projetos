package br.com.joaolorenco.padroes.criacionais.singleton;

/**
 *
 * @author joao-
 */
public class Singleton {

    //Unica instancia
    private static Singleton instancia;

    //Criar um construtor privado
    //Evitar instancias externas
    private Singleton() {
    }
    public static Singleton getInstancia(){
        if(instancia==null){
            instancia=new Singleton();
        }
        return instancia;
    }
    
    public void mostrarMensagem(){
        System.out.println("Mensagem padrao instancia Singletao");
    }

}

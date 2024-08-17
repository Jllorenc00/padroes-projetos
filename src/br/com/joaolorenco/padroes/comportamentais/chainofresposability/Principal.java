package br.com.joaolorenco.padroes.comportamentais.chainofresposability;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        //Criar Manipuladores
        Manipulador man1 = new ManipuladorConcreto1();
        Manipulador man2 = new ManipuladorConcreto2();
        Manipulador man3 = new ManipuladorConcreto3();

        //configurar cadeia de responsabilidade
        man1.setProximo(man2);
        man2.setProximo(man3);
        
        //Iniciar o processamento das requisições
        man1.tratarRequisicao("Requisicao1");
        man1.tratarRequisicao("Requisicao2");
        man1.tratarRequisicao("Requisicao3");
        //Este não será manipulado
        man1.tratarRequisicao("Requisicao4");
    }

}

package br.com.joaolorenco.padroes.comportamentais.chainofresposability;

/**
 *
 * @author joao-
 */
public class ManipuladorConcreto2 extends Manipulador {

    @Override
    public void tratarRequisicao(String requisicao) {
        if (requisicao.equals("Requisicao2")) {
            System.out.println("Manipulador 2 tratou a requisicao");
        }
    }
}

package br.com.joaolorenco.padroes.comportamentais.chainofresposability;

/**
 *
 * @author joao-
 */
public class ManipuladorConcreto3 extends Manipulador {

    @Override
    public void tratarRequisicao(String requisicao) {
        if (requisicao.equals("Requisicao3")) {
            System.out.println("Manipulador 3 tratou a requisicao");
        }
    }
}

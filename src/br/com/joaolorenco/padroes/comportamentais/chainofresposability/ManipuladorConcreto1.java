package br.com.joaolorenco.padroes.comportamentais.chainofresposability;

/**
 *
 * @author joao-
 */
public class ManipuladorConcreto1 extends Manipulador {

    @Override
    public void tratarRequisicao(String requisicao) {
        if (requisicao.equals("Requisicao1")) {
            System.out.println("Manipulador 1 tratou a requisicao");
        }
    }

}

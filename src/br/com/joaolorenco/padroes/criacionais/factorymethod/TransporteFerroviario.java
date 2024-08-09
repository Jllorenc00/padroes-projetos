package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class TransporteFerroviario implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte Ferroviario");
    }

}

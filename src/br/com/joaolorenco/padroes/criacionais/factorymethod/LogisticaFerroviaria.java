package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class LogisticaFerroviaria extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }

}

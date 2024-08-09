package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class LogisticaTerrestre extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}

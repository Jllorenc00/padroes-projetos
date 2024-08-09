package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class LogisticaMaritima extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }

}

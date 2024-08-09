package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {

        Logistica logFerroviaria = new LogisticaFerroviaria();
        logFerroviaria.organizarEntrega();
        Logistica logMaritima = new LogisticaMaritima();
        logMaritima.organizarEntrega();
        Logistica logTerrestre = new LogisticaTerrestre();
        logTerrestre.organizarEntrega();

    }
}

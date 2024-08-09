package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public abstract class Logistica {

    //Metodo Fabrica
    public abstract Transporte criarTransporte();

    //Metodo para organizar a entrega
    public void organizarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}

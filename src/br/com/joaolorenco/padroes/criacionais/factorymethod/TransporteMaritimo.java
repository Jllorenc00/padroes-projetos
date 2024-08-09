package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class TransporteMaritimo implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte Maritmo");
    }

}

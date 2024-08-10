package br.com.joaolorenco.padroes.estruturais.decorator;

/**
 *
 * @author joao-
 */
public class Acucar extends CafeDecorator {

    public Acucar(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double getCusto() {
        return cafe.getCusto() + 2.99;
    }

    @Override
    public String getDesc() {
        return cafe.getDesc() + ", acucar";
    }

}

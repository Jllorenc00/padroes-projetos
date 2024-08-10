package br.com.joaolorenco.padroes.estruturais.decorator;

/**
 *
 * @author joao-
 */
public abstract class CafeDecorator implements Cafe {

    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDesc() {
        return cafe.getDesc();
    }

    @Override
    public double getCusto() {
        return cafe.getCusto();
    }

}

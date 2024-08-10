package br.com.joaolorenco.padroes.estruturais.decorator;

/**
 *
 * @author joao-
 */
public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 4.90;
    }

    @Override
    public String getDesc() {
        return cafe.getDesc() + ", leite";
    }

}

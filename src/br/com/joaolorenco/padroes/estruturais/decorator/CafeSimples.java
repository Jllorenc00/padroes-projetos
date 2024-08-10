package br.com.joaolorenco.padroes.estruturais.decorator;

/**
 *
 * @author joao-
 */
public class CafeSimples implements Cafe {

    @Override
    public String getDesc() {
        return "Cafe Simples";
    }

    @Override
    public double getCusto() {
        return 2.00;
    }    
    
}

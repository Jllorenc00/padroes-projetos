package br.com.joaolorenco.padroes.comportamentais.strategy;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {

        CarrinhoDeCompras car = new CarrinhoDeCompras();

        car.setEstrategiaPagamento(new PagamentoCartaoCredito("1234 4567", "Joao Silva"));
        car.pagar(100.00);

        car.setEstrategiaPagamento(new PagamentoPix("email@email.com"));
        car.pagar(500.00);

        car.setEstrategiaPagamento(new PagamentoBoleto("3263565"));
        car.pagar(300.00);
    }
}

package br.com.joaolorenco.padroes.comportamentais.strategy;

/**
 *
 * @author joao-
 */
public class PagamentoBoleto implements PagamentoStrategy {
    private String email;

    public PagamentoBoleto(String email) {
        this.email = email;
    }
    

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado via Boleto. Conta: " + email);
    }

}

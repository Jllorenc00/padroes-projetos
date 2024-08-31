package br.com.joaolorenco.padroes.comportamentais.strategy;

/**
 *
 * @author joao-
 */
public class PagamentoCartaoCredito implements PagamentoStrategy {

    private String nCartao;
    private String nTitular;

    public PagamentoCartaoCredito(String nCartao, String nTitular) {
        this.nCartao = nCartao;
        this.nTitular = nTitular;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado via Cartao de Credito. Titular: " + nTitular + " cartao: " + nCartao);
    }

}

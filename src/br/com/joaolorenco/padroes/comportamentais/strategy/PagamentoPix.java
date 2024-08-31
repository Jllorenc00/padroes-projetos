package br.com.joaolorenco.padroes.comportamentais.strategy;

/**
 *
 * @author joao-
 */
public class PagamentoPix implements PagamentoStrategy {

    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado via Pix. Chave Pix: " + chavePix);
    }

}

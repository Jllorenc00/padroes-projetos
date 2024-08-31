package br.com.joaolorenco.padroes.comportamentais.strategy;

/**
 *
 * @author joao-
 */
public class CarrinhoDeCompras {
    
    private PagamentoStrategy estrategiaPagamento;
    
    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }
    
    public void pagar(double valor) {
        estrategiaPagamento.pagar(valor);
    }
    
}

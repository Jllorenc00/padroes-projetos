package br.com.joaolorenco.padroes.estruturais.adapter;

/**
 *
 * @author joao-
 */
public class AdaptadorPagamento implements SistemaPagamentoNovo {

    private SistemaPagamentoAntigo sistemaPagamentoAntigo;

    public AdaptadorPagamento(SistemaPagamentoAntigo sistemaPagamentoAntigo) {
        this.sistemaPagamentoAntigo = sistemaPagamentoAntigo;
    }

    @Override
    public void processaPagamento(String clienteId, double valor) {
        sistemaPagamentoAntigo.realizarPagamento(clienteId, valor);
    }

}

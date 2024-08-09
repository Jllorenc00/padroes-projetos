package br.com.joaolorenco.padroes.estruturais.adapter;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        SistemaPagamentoAntigo sistemaPagamentoAntigo = new SistemaPagamentoAntigo();
        SistemaPagamentoNovo sistemaPagamentoNovo = new AdaptadorPagamento(sistemaPagamentoAntigo);
     
        sistemaPagamentoNovo.processaPagamento("12345", 199.99);
    }
}

package br.com.joaolorenco.padroes.comportamentais.visitor;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {

        Item i1 = new Livro("Padroes Projeto", 50.0);
        Item i2 = new Fruta("Banana", 2.5, 10.0);

        Visitante vis = new VisitanteCarrinhoCompras();
        i1.aceitar(vis);
        i2.aceitar(vis);
    }
}

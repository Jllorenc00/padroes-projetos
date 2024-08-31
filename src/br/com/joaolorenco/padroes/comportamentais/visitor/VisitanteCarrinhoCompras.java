package br.com.joaolorenco.padroes.comportamentais.visitor;

/**
 *
 * @author joao-
 */
public class VisitanteCarrinhoCompras implements Visitante {

    @Override
    public void visitar(Livro livro) {
        System.out.println("Livro: " + livro.getTitulo() + " custa: " + livro.getPreco());
    }

    @Override
    public void visitar(Fruta fruta) {
        double custo = fruta.getPeso() * fruta.getPrecoporKg();
        System.out.println("Fruta: " + fruta.getNome() + " custa: " + custo);
    }
    
}

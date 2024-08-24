package br.com.joaolorenco.padroes.comportamentais.observer;

/**
 *
 * @author joao-
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Produto produto = new Produto("Smartphone Galaxy A30", 10);
        
        Cliente c1 = new Cliente("Heloisa");
        Cliente c2 = new Cliente("Luis");
        
        produto.adicionarObervador(c1);
        produto.adicionarObervador(c2);
        
        produto.setQuantidade(20);
        produto.removeObservador(c2);
        produto.setQuantidade(5);
        
    }
}

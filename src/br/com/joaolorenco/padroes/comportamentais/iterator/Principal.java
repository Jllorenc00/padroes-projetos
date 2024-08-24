package br.com.joaolorenco.padroes.comportamentais.iterator;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        String[] nomes = {"Joao", "Isadora", "Isaias","Kauan"};
        ColecaoDeNomes colecao = new ColecaoDeNomes(nomes);
        
        Iterator<String> iterator = colecao.criarIterator();
        
        while(iterator.temProximo()){
            System.out.println(iterator.proximo());
        }
                
                
    }
}

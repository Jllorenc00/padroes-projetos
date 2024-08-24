package br.com.joaolorenco.padroes.comportamentais.iterator;

/**
 *
 * @author joao-
 */
public class ColecaoDeNomes implements ColecaoAgregada<String> {

    private String[] nomes;

    public ColecaoDeNomes(String[] nomes) {
        this.nomes = nomes;
    }

    @Override
    public Iterator<String> criarIterator() {
        return new IteratorDeNomes();
    }

//classe interna
    private class IteratorDeNomes implements Iterator<String> {

        private int indice = 0;

        @Override
        public boolean temProximo() {
            //verifica se indice é menor que nomes.length
            return indice < nomes.length;
        }

        @Override
        public String proximo() {
            if (temProximo()) {
                return nomes[indice++];
            }
            return null;
        }

    }

}

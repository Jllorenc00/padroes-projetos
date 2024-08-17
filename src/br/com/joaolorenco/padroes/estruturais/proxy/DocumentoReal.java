package br.com.joaolorenco.padroes.estruturais.proxy;

/**
 *
 * @author joao-
 */
public class DocumentoReal implements Documento {

    private String nomeArquivo;

    public DocumentoReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    public void carregarDoDisco() {
        System.out.println("Carregando: " + nomeArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo: " + nomeArquivo);
    }

}

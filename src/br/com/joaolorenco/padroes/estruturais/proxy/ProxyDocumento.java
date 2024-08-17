package br.com.joaolorenco.padroes.estruturais.proxy;

/**
 *
 * @author joao-
 */
public class ProxyDocumento implements Documento {

    private DocumentoReal documentoReal;
    private String nomeArquivo;

    public ProxyDocumento(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir() {
        if (documentoReal == null) {
            documentoReal = new DocumentoReal(nomeArquivo);
        }
        documentoReal.exibir();
    }

}

package br.com.joaolorenco.padroes.criacionais.prototype;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        //criar objeto original
        Documento documentoOriginal = new Documento("Titulo Original", "Conteudo Original");
        System.out.println("Documento Original: " + documentoOriginal);
        //criar clone

        Documento docClone = new Documento("Titulo Clone", "Conteudo Clone");
        System.out.println("Documento Clone: " + docClone);

        //alterar clone
        documentoOriginal.setTitulo("Titulo Clone");
        docClone.setConteudo("Conteudo Clone");

        System.out.println("--------------------");
        System.out.println("Após modificar o Clone:");
        System.out.println("Documento original: " + documentoOriginal);
        System.out.println("Documento Clone: " + docClone);
    }
}

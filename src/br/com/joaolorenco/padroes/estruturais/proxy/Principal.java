package br.com.joaolorenco.padroes.estruturais.proxy;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Documento doc = new ProxyDocumento("Ex.pdf");
        //doc carrregado do disco 1ªvez
        doc.exibir();
        //doc carregado do disco 2ª vez
        doc.exibir();
        
        
    }
}

package br.com.joaolorenco.padroes.estruturais.decorator;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        
        Cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDesc() + " custa: " + meuCafe.getCusto());
        
        meuCafe = new Leite(meuCafe);
        System.out.println(meuCafe.getDesc() + " custa " + meuCafe.getDesc());
        
        meuCafe = new Acucar(meuCafe);
        System.out.println(meuCafe.getDesc() + " custa " + meuCafe.getDesc());
    }

}

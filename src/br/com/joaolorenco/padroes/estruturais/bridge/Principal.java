package br.com.joaolorenco.padroes.estruturais.bridge;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        ControleRemoto controleBas = new ControleRemotoBasico(tv);
        System.out.println("Usando controle Basico: ");
        controleBas.ligarDesligar();
        controleBas.aumentarVol();
        controleBas.diminuirVol();
        controleBas.ligarDesligar();
        
        Dispositivo radio = new Radio();
        ControleRemoto controleAvan = new ControleRemotoAvancado(radio);
        System.out.println("Usando controle Avancado: ");
        controleAvan.ligarDesligar();
        controleAvan.aumentarVol();
        controleAvan.diminuirVol();
        controleAvan.silenciar();
        controleAvan.ligarDesligar();
        
    }
}

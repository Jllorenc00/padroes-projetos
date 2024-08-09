package br.com.joaolorenco.padroes.estruturais.bridge;

/**
 *
 * @author joao-
 */
public class Televisao implements Dispositivo {

    private boolean ligado = false;
    private int vol = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Tv ligada");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Tv desligada");
    }

    @Override
    public void aumentarVol() {
        if (ligado && vol < 100) {
            vol++;
        }
        System.out.println("Volume da Tv: " + vol);
    }

    @Override
    public void diminuirVol() {
        if (ligado && vol > 0) {
            vol--;
        }
        System.out.println("Volume da Tv: " + vol);
    }

    @Override
    public boolean on() {
        return ligado;
    }

    @Override
    public void silenciar() {
        System.out.println("Volume Silenciado");
    }

}

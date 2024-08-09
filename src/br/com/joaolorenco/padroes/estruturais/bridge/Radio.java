package br.com.joaolorenco.padroes.estruturais.bridge;

/**
 *
 * @author joao-
 */
public class Radio implements Dispositivo {

    private boolean ligado = false;
    private int vol = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Radio Ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Radio Desligado");
    }

    @Override
    public void aumentarVol() {
        if (ligado && vol < 100) {
            vol++;
        }
        System.out.println("Volume do Radio: " + vol);
    }

    @Override
    public void diminuirVol() {
        if (ligado && vol > 0) {
            vol--;
        }
        System.out.println("Volume do Radio: " + vol);
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

package br.com.joaolorenco.padroes.estruturais.bridge;

/**
 *
 * @author joao-
 */
public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDesligar() {
        if (dispositivo.on()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    @Override
    public void aumentarVol() {
        dispositivo.aumentarVol();
    }

    @Override
    public void diminuirVol() {
        dispositivo.diminuirVol();
    }

    @Override
    public void silenciar() {
        /*System.out.println("Dispositivo silenciado");
        while (dispositivo.on()) {
            dispositivo.diminuirVol();
        }*/
        dispositivo.silenciar();
    }

}

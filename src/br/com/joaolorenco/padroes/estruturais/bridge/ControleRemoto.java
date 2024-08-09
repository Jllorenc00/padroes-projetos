package br.com.joaolorenco.padroes.estruturais.bridge;

/**
 *
 * @author joao-
 */
public abstract class ControleRemoto {

    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void ligarDesligar();

    public abstract void aumentarVol();

    public abstract void diminuirVol();

    public abstract void silenciar();
    
    //teste

}

package br.com.joaolorenco.padroes.estruturais.bridge;

/**
 *
 * @author joao-
 */
public interface Dispositivo {
    void ligar();
    void desligar();
    void aumentarVol();
    void diminuirVol();
    void silenciar();
    boolean on();
}

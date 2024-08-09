package br.com.joaolorenco.padroes.criacionais.builder;

/**
 *
 * @author joao-
 */
public class Casa {

    String paredes;
    String telhado;
    String portas;
    String janelas;

    public String getParedes() {
        return paredes;
    }

    public String getTelhado() {
        return telhado;
    }

    public String getPortas() {
        return portas;
    }

    public String getJanelas() {
        return janelas;
    }
    
    private Casa(){
    }
    
    public Casa(Builder builder){
        this.paredes = builder.paredes;
        this.telhado = builder.telhado;
        this.portas = builder.portas;
        this.janelas = builder.janelas;
    }
}

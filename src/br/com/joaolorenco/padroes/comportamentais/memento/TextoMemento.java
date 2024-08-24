package br.com.joaolorenco.padroes.comportamentais.memento;

/**
 *
 * @author joao-
 */
// Classe Memento armazena o estado do objeto
public class TextoMemento {

    private final String estado;

    public TextoMemento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

}

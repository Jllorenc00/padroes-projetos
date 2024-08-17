package br.com.joaolorenco.padroes.comportamentais.chainofresposability;

/**
 *
 * @author joao-
 */
public abstract class Manipulador {

    protected Manipulador proximo;

    public void setProximo(Manipulador proximo) {
        this.proximo = proximo;
    }

    public abstract void tratarRequisicao(String requisicao);
}

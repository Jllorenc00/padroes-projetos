package br.com.joaolorenco.padroes.comportamentais.state;

/**
 *
 * @author joao-
 */
public interface State {
    
    void inserirMoeda();
    
    void ejetarMoeda();
    
    void acionarAlavanca();
    
    void dispensarProduto();

}

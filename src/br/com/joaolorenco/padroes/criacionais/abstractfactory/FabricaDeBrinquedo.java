package br.com.joaolorenco.padroes.criacionais.abstractfactory;

import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Porco;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Raposa;

/**
 *
 * @author bispo.8977
 */
public interface FabricaDeBrinquedo {
    
    Ursinho criarUsinho();
    
    Coelho criarCoelho();
    
    Raposa criarRaposa();
    
    Porco criarPorco();
}

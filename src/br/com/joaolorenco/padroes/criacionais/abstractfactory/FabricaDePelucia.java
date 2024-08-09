package br.com.joaolorenco.padroes.criacionais.abstractfactory;

import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.RaposaDePelucia;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Porco;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.UrsinhoDePelucia;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.CoelhoDePelucia;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Raposa;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.PorcoDePelucia;

public class FabricaDePelucia implements FabricaDeBrinquedo {

    @Override
    public Ursinho criarUsinho() {
        return new UrsinhoDePelucia();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePelucia();
    }

    public Porco criarPorco() {
        return new PorcoDePelucia();
    }

    public Raposa criarRaposa(){
        return new RaposaDePelucia();
    }
}

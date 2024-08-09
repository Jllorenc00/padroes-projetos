/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.joaolorenco.padroes.criacionais.abstractfactory;

import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.PorcoDePlastico;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Porco;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.CoelhoDePlastico;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.UrsinhoDePlastico;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.RaposaDePlastico;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Raposa;

/**
 *
 * @author bispo.8977
 */
public class FabricaDePlastico implements FabricaDeBrinquedo {

    @Override
    public Ursinho criarUsinho() {
        return new UrsinhoDePlastico();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePlastico();
    }

    public Porco criarPorco() {
        return new PorcoDePlastico();
    }

    public Raposa criarRaposa(){
        return new RaposaDePlastico();
    }
}

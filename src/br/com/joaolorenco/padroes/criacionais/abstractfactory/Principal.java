package br.com.joaolorenco.padroes.criacionais.abstractfactory;

import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Porco;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.joaolorenco.padroes.criacionais.abstractfactory.bichos.Raposa;

/**
 *
 * @author bispo.8977
 */
public class Principal {

    public static void main(String[] args) {

        FabricaDeBrinquedo fabricaPelucia = new FabricaDePelucia();
        Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
        Ursinho ursinhoPelucia = fabricaPelucia.criarUsinho();
        coelhoPelucia.exibir();
        ursinhoPelucia.exibir();

        FabricaDeBrinquedo fabricaPlastico = new FabricaDePlastico();
        Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
        Ursinho ursoPlastico = fabricaPlastico.criarUsinho();
        coelhoPlastico.exibir();
        ursoPlastico.exibir();
        

        Porco porcoPlastico = fabricaPlastico.criarPorco();
        Raposa raposaPlastico = fabricaPlastico.criarRaposa();
        porcoPlastico.exibir();
        raposaPlastico.exibir();
        
        Porco porcoPelucia = fabricaPlastico.criarPorco();
        Raposa raposaPelucia = fabricaPlastico.criarRaposa();
        porcoPelucia.exibir();
        raposaPelucia.exibir();
    }
}

package br.com.joaolorenco.padroes.comportamentais.state;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {

        //Cria maquina de venda
        MaquinaVenda maquinaVenda = new MaquinaVenda(2);

        //tenta acionar alavanca sem moeda
        maquinaVenda.acionarAlavanca();

        //adiciona moeda
        maquinaVenda.inserirMoeda();
        maquinaVenda.acionarAlavanca();

        maquinaVenda.inserirMoeda();
        maquinaVenda.ejetarMoeda();

        //adiciona nova moeda
        maquinaVenda.inserirMoeda();
        maquinaVenda.acionarAlavanca();

        //adiciona nova moeda - produto sem estoque
        maquinaVenda.inserirMoeda();
    }
}

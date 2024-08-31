package br.com.joaolorenco.padroes.comportamentais.state;

/**
 *
 * @author joao-
 */
public class VendendoState implements State {

    private MaquinaVenda maquinaVenda;

    public VendendoState(MaquinaVenda maquinaVenda) {
        this.maquinaVenda = maquinaVenda;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde, ja estamos " + "processando uma venda.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Ja estamos processando uma venda." + "nao e possivel ejetar a moeda.");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca ja foi acionada.");
    }

    @Override
    public void dispensarProduto() {
        maquinaVenda.liberarProduto();
        if (maquinaVenda.getQuantidade() > 0) {
            maquinaVenda.setEstado(maquinaVenda.getSemMoedaState());
        } else {
            maquinaVenda.setEstado(maquinaVenda.getSemEstoqueState());
        }
    }

}

package br.com.joaolorenco.padroes.comportamentais.templatemethod;

/**
 *
 * @author joao-
 */
public class Cha extends Bebida{

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionar saquinho de cha");
    }

    @Override
    protected void adicionarIngredientesExtras() {
        System.out.println("Adicionar limao");
    }

}

package br.com.joaolorenco.padroes.comportamentais.templatemethod;

/**
 *
 * @author joao-
 */
public class Cafe extends Bebida{

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionar po do cafe na agua");
    }

    @Override
    protected void adicionarIngredientesExtras() {
        System.out.println("Adicionar chantily");
    }

}

package br.com.joaolorenco.padroes.comportamentais.templatemethod;

/**
 *
 * @author joao-
 */
public abstract class Bebida {

    public final void preparar() {
        ferverAgua();
        adicionarIngredientePrincipal();
        adicionarIngredientesExtras();
        servir();
    }

    //passos comuns para todas as bebidas
    private void ferverAgua() {
        System.out.println("Fervendo agua");
    }

    //passo que deve ser implementado pela subclasse
    protected abstract void adicionarIngredientePrincipal();

    //método opcional
    protected abstract void adicionarIngredientesExtras();

    private void servir() {
        System.out.println("Servindo a bebida...");
    }
}

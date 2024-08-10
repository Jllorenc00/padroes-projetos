package br.com.joaolorenco.padroes.estruturais.composite;

/**
 *
 * @author joao-
 */
public class Funcionario implements Empregado {

    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void mostrarDet() {
        System.out.println(nome + " - " + cargo);
    }

}

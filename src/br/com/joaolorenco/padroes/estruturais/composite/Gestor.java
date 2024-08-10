package br.com.joaolorenco.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao-
 */
public class Gestor implements Empregado {

    private String nome;
    private String cargo;
    private List<Empregado> subordinados;

    public Gestor(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSub(Empregado empregado) {
        this.subordinados.add(empregado);
    }

    public void removerSub(Empregado empregado) {
        this.subordinados.remove(empregado);
    }

    @Override
    public void mostrarDet() {
        System.out.println(nome + " - " + cargo);
        for (Empregado subordinado : subordinados) {
            subordinado.mostrarDet();
        }
    }

}

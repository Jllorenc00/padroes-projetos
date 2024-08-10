package br.com.joaolorenco.padroes.estruturais.composite;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Empregado fun1 = new Funcionario("Luana", "Suporte");
        Empregado fun2 = new Funcionario("Leticia", "Suporte");

        Gestor ges1 = new Gestor("Joao", "Lider Suporte");

        ges1.adicionarSub(fun1);
        ges1.adicionarSub(fun2);

        Empregado fun3 = new Funcionario("Thais", "Gerente Novas Contas");

        Gestor diretor = new Gestor("Thiago", "CEO");
        diretor.adicionarSub(fun3);
        diretor.adicionarSub(ges1);

        System.out.println("Detalhes da Estrutura da Empresa");
        diretor.mostrarDet();
    }

}

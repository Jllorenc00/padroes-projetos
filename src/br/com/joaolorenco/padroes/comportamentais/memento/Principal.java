package br.com.joaolorenco.padroes.comportamentais.memento;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        //escrever no editor
        editor.escrever("ola, ");
        historico.salvarMemento(editor.salvar());

        editor.escrever("Mundo");
        historico.salvarMemento(editor.salvar());

        editor.escrever(" Este e um editor de texto");

        System.out.println("Texto atual: " + editor.mostrarTexto());

        //desfazer operações
        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer: " + editor.mostrarTexto());

        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer novamente: " + editor.mostrarTexto());
    }

}

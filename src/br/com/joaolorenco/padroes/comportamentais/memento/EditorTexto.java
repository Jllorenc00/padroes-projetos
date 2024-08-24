package br.com.joaolorenco.padroes.comportamentais.memento;

/**
 *
 * @author joao-
 */
public class EditorTexto {

    private StringBuilder texto;

    public EditorTexto() {
        texto = new StringBuilder();
    }

    // adiciona o texto ao editor
    public void escrever(String novoTexto) {
        texto.append(novoTexto);
    }

    // mostra o conteudo atual ao editor
    public String mostrarTexto() {
        return texto.toString();
    }

    public TextoMemento salvar() {
        return new TextoMemento(texto.toString());
    }

    public void desfazer(TextoMemento memento) {
        texto = new StringBuilder(memento.getEstado());
    }
}

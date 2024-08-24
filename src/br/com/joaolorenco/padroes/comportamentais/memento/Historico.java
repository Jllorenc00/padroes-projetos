package br.com.joaolorenco.padroes.comportamentais.memento;

import java.util.Stack;

/**
 *
 * @author joao-
 */
public class Historico {

    private Stack<TextoMemento> historico = new Stack<>();
    
    public void salvarMemento(TextoMemento memento){
        historico.push(memento);
    }
    
    public TextoMemento desfazer(){
        if(!historico.isEmpty()){
            return historico.pop();
        }
        return null;
    }
}

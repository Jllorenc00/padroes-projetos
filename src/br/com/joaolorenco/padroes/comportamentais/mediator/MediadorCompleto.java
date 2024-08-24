package br.com.joaolorenco.padroes.comportamentais.mediator;

import java.util.*;

/**
 *
 * @author joao-
 */
public class MediadorCompleto implements Mediator{

    private List<Colaborador> colaboradores;

    public MediadorCompleto(){
        this.colaboradores = new ArrayList<>();
    }
    
    @Override
    public void enviarMensagem(String mensagem, Colaborador remetente) {
        for (Colaborador colaborador : colaboradores){
            if (colaborador != remetente){
                colaborador.receberMensagem(mensagem);
            }
        }
    }

    @Override
    public void adicionarColaborador(Colaborador colaborador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


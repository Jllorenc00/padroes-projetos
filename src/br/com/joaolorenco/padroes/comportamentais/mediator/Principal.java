package br.com.joaolorenco.padroes.comportamentais.mediator;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Mediator mediator = new MediadorCompleto();
        Colaborador c1 = new ColaboradorConcreto(mediator, "Jose");
        Colaborador c2 = new ColaboradorConcreto(mediator, "Jose");
        Colaborador c3 = new ColaboradorConcreto(mediator, "Jose");
        Colaborador c4 = new ColaboradorConcreto(mediator, "Jose");
        Colaborador c5 = new ColaboradorConcreto(mediator, "Jose");
        
        c1.enviarMensagem("Opa 1");
        c2.enviarMensagem("Opa 2");
        c3.enviarMensagem("Opa 3");
        c4.enviarMensagem("Opa 4");
        c5.enviarMensagem("Opa 5");
        
    }
    
}

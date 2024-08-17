package br.com.joaolorenco.padroes.comportamentais.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joao-
 */
public class Interpreter {

    private Map<Character, Comando> comandos;

    public Interpreter() {
        comandos = new HashMap<>();
        comandos.put('A', new AndarParaFrente());
        comandos.put('D', new VirarADireita());
        comandos.put('E', new VirarAEsquerda());
    }

    public void interpretar(String instrucoes) {
        for (char codigo : instrucoes.toCharArray()) {
            Comando comando = comandos.get(codigo);
            if (comando != null) {
                comando.executar();
            }
        }
    }
}

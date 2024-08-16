package br.com.joaolorenco.padroes.estruturais.flyweight;

/**
 *
 * @author joao-
 */
public class Principal {

    public static final String[] cores = {
        "Azul",
        "Preto",
        "Branco"
    };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Circulo circulo = (Circulo) FormaFactory.
                    getCirculo(getCorAleatoria());
            circulo.setX(getCoordenadaAleatoria());
            circulo.setY(getCoordenadaAleatoria());
            circulo.setRaio(100);
            circulo.desenhar();

        }

    }

    public static String getCorAleatoria() {
        int aleatorio = (int) (Math.random() * cores.length);
        return cores[aleatorio];
    }

    private static int getCoordenadaAleatoria() {
        int aleatorio = (int) (Math.random() * 100);
        return aleatorio;
    }

}

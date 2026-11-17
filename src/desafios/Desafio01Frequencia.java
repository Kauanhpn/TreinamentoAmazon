package desafios;

import java.util.HashMap;

public class Desafio01Frequencia {

    public static void main(String[] args) {

        int[] numeros = {2, 5, 2, 8, 5, 9, 2};

        HashMap<Integer, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {

            int numeroAtual = numeros[i];

            if (frequencia.containsKey(numeroAtual)) {
                int quantidade = frequencia.get(numeroAtual);
                frequencia.put(numeroAtual, quantidade + 1);

            } else {
                frequencia.put(numeroAtual, 1);
            }

        }
        System.out.println(frequencia);
    }
}

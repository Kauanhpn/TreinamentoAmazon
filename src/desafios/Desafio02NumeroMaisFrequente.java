package desafios;

import java.util.HashMap;
import java.util.Map;

public class Desafio02NumeroMaisFrequente {
    public static void main(String[] args) {

        int[] numeros = {4, 2, 4, 3, 2, 4, 5, 2, 2};

        HashMap<Integer, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {

            int numeroAtual = numeros[i];
            if(frequencia.containsKey(numeroAtual)){
                int quantidade = frequencia.get(numeroAtual);
                frequencia.put(numeroAtual, quantidade + 1);

            }else {
                frequencia.put(numeroAtual , 1);
            }
        }

        int maiorFrequencia = 0;
        int numeroMaisFrequente = 0;

        for (Map.Entry<Integer, Integer> entrada : frequencia.entrySet()) {
            int numero = entrada.getKey();
            int quantidade = entrada.getValue();
            if (quantidade > maiorFrequencia) {
                maiorFrequencia = quantidade;
                numeroMaisFrequente = numero;
            }


        }
        System.out.println("Numero mais frequente" + numeroMaisFrequente);
        System.out.println("Quantidade" + maiorFrequencia);


    }
}

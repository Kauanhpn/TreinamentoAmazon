package arrays;

public class RobotPath {


    private boolean caminhoValido(int[] posicoesAtuais, int[] proximasPosicoes) {
        for (int i = 0; i < posicoesAtuais.length; i++) {
            if (Math.abs(posicoesAtuais[i] - proximasPosicoes[i]) > 1) {
                return false;
            }

        }
        return true;
    }


    private int[] pegarPosicoesDosRobos(int[] linha, int numRobots) {

        int[] posicoes = new int[numRobots];
        int indice = 0;


        for (int coluna = 0; coluna < linha.length; coluna++) {
            if (linha[coluna] == 1) {
                posicoes[indice] = coluna;
                indice++;

            }

        }
        return posicoes;


    }


    public boolean isValidPath(int numRobots, int[][] matriz) {
        if (matriz.length == 0) {
            return false;
        }
        for (int linha = 0; linha < matriz.length; linha++) {

            int robosNaLinha = 0;

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                if (matriz[linha][coluna] == 1) {
                    robosNaLinha++;
                }
            }

            if (robosNaLinha != numRobots) {
                return false;
            }

        }

        int[] posicoesAtuais = pegarPosicoesDosRobos(matriz[0], numRobots);

        for (int linha = 1; linha < matriz.length; linha++) {
            int[] proximasPosicoes = pegarPosicoesDosRobos(matriz[linha], numRobots);


            if (!caminhoValido(posicoesAtuais, proximasPosicoes)) {
                return false;
            }
            posicoesAtuais = proximasPosicoes;

        }


        return true;


    }


}




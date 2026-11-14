package arrays;

public class TestRobotPath {

    public static void main(String[] args) {

        RobotPath teste = new RobotPath();
        int[][] matriz = {
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 1, 0, 1}
        };
        boolean resultado = teste.isValidPath(2, matriz);

        System.out.println("Caminho válido: " + resultado);

    }

}

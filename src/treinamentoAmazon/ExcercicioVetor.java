package treinamentoAmazon;

import entities.Products;

import java.util.Scanner;

public class ExcercicioVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Products(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double media = soma / vect.length;

        System.out.printf("MEDIA DOS PRODUTOS : %.2f%n", media);


        sc.close();
    }
}

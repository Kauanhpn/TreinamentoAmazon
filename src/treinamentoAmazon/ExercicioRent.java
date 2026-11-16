package treinamentoAmazon;

import entities.Rent;

import java.util.Scanner;

public class ExercicioRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; //Vetor criou os 10 epacos para ser usados de quarto de hotel

        System.out.print("How many rooms will be rented?"); //Pegunta para o usuário quantas pessoas serao acomodadas
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();


            vect[numeroQuarto] = new Rent(name, email);

        }
        System.out.println();
        System.out.println("Busy Rooms");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + " : " + vect[i]);
            }
        }


        sc.close();

    }
}

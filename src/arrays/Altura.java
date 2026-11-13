package arrays;

import java.util.Scanner;

import entities.Pessoa;

public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite quantas pessoas serao cadastratas ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome");
            String nome = sc.nextLine();
            System.out.println("Digite a idade");
            int idade = sc.nextInt();
            System.out.println("Digite a altura");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }

        double media = soma / vect.length;

        int menores = 0;
        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getIdade() < 16) {
                menores++;

            }
        }
        double porcentagem = (double) menores / n * 100;
        System.out.printf("Porcentagem de menores de 16 anos:  %.2f%%%n " , porcentagem);

        System.out.println("Alunos de menores: " + menores);
        System.out.printf("Media de altura:  %.2f%n" , media);
        System.out.println("Nomes dos alunos que sao de menor ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }

        }

        sc.close();
    }
}

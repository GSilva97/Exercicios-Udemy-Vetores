package application.vertorExercicios;

import application.vertorExercicios.entity.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Zero3Pessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Os dados de quantas pessoas serao digitados? ");
        int q = sc.nextInt();
        Pessoa[] vetor = new Pessoa[q];

        for (int c = 0; c < q; c++) {
            System.out.println("Dados da pessoa:");
            sc.nextLine();
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[c] = new Pessoa(nome, idade, altura);
        }
        double soma = 0.0;
        for (int c = 0; c < q; c++) {
            soma += vetor[c].getAltura();
        }
        double mediaAltura = soma / q;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int menosIdade = 0;
        String nomeIdade;

        for (int c = 0; c < q; c++) {
            if (vetor[c].getIdade() < 16) {
                menosIdade++;
            }
        }
        if (q > 0) {
            double calc = (double) menosIdade / q;
            double porcentagem = calc * 100;
            System.out.printf("A procentagem de pessoas com idade menor que 16 é: %.2f%% ", porcentagem);
        }


        sc.close();
    }
}

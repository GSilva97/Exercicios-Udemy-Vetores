package application.vertorExercicios;

import application.vertorExercicios.entity.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Zero9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoa você vai digitar? ");
        int q = sc.nextInt();
        int cp = 1;
        int maiorIdade = 0;
        String maisVelha = "";
        Pessoa[] vetor = new Pessoa[q];

        for (int c = 0; c < q; c++, cp++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", cp);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vetor[c] = new Pessoa(nome, idade);
        }
        System.out.print("Pessoa mais velha: ");
        for (int c = 0; c < q; c++) {
            if (vetor[c].getIdade() > maiorIdade) {
                maiorIdade = vetor[c].getIdade();
                maisVelha = vetor[c].getNome();

            }
        }
        System.out.println(maisVelha);

        sc.close();
    }
}

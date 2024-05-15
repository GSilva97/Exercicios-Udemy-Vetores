package application.vertorExercicios;

import application.vertorExercicios.entity.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Zero10Aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos seram digitados? ");
        int q = sc.nextByte();
        Aluno[] vetor = new Aluno[q];

        int cA = 1;
        for (int c = 0; c < q; c++, cA++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %da aluno:\n ", cA);
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            vetor[c] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados: ");
        double somaN = 0.0;
        double media = 0.0;
        for (int c = 0; c < q; c++) {
            somaN = vetor[c].getN1() + vetor[c].getN2();
            media = somaN / 2;
            if (media >= 6.0) {
                System.out.println(vetor[c].getNome());

            }
        }


        sc.close();
    }
}

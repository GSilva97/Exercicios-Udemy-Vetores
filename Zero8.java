package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int q = sc.nextInt();
        int[] vetor = new int[q];
        double mediaPar = 0.0;
        int qtdPar = 0;

        for (int c = 0; c < q; c++) {
            System.out.print("Digite um numero: ");
            vetor[c] = sc.nextInt();
        }


        int soma = 0;
        for (int c = 0; c < q; c++) {
            int resto = vetor[c] % 2;
            if (resto == 0) {
                qtdPar++;
                soma += vetor[c];
                mediaPar = soma / qtdPar;
            }
        }
        if (qtdPar > 0) {
            System.out.printf("MEDIA DOS PARES = %.2f%n", mediaPar);
        } else
            System.out.println("NENHUM NUMERO PAR ");


        sc.close();

    }
}





package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int q = sc.nextInt();
        double[] vetor = new double[q];
        double media = 0.0;
        double soma = 0;

        for (int c = 0; c < q; c++) {
            System.out.print("Digite um numero: ");
            vetor[c] = sc.nextDouble();
        }
        for (int c = 0; c < q; c++) {
            soma += vetor[c];
            media = soma / q;
        }
        System.out.println("MEDIA DO VETOR: ");
        System.out.printf("%.3f\n",media);


        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int c = 0; c < q; c++) {
            if (vetor[c] < media) {
                System.out.printf("%.2f\n", vetor[c]);
            }

        }

        sc.close();
    }
}

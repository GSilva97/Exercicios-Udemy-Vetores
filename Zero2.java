package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int c = 0; c < n; c++) {
            System.out.println("Digite um valor: ");
            vetor[c] = sc.nextDouble();
        }

        System.out.print("VALORES: ");
        for (int c = 0; c < n; c++) {
            System.out.printf("%.2f, ", vetor[c]);
        }

        double soma = 0.0;
        for (int c = 0; c < n; c++) {
            soma += vetor[c];
        }
        System.out.println();
        System.out.print("SOMA DOS VALORES: " + soma);
        System.out.println();

        double media = soma / n;
        System.out.printf("MEDIA: %.2f ", media);

        sc.close();
    }
}

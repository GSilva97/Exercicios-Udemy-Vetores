package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int q = sc.nextInt();

        int[] vetorA = new int[q];
        int[] vetorB = new int[q];
        int[] vSoma = new int[q];

        System.out.println("Digite os valores do vetor A: ");
        for (int c = 0; c < q; c++) {
            vetorA[c] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int c = 0; c < q; c++) {
            vetorB[c] = sc.nextInt();
        }
        for (int c = 0; c < q; c++) {
            vSoma[c] = vetorA[c] + vetorB[c];

        }
        System.out.println("Vetor resultante: ");

        for (int c = 0; c < q; c++) {

            System.out.printf("%d\n", vSoma[c]);
        }
        sc.close();
    }
}

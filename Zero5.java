package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar?");
        int q = sc.nextInt();
        double[] vetor = new double[q];

        double maiorN = 0;
        int p = 0;
        for (int c = 0; c < q; c++) {
            System.out.println("Digite um numero: ");
            vetor[c] = sc.nextDouble();
            if (vetor[c] > maiorN) {
                maiorN = vetor[c];
                p = c;
            }
        }
            System.out.printf("Maior numero digitado : %.2f%n", maiorN);

            System.out.println("Posição do maior numero: " + p);

            sc.close();
        }
    }

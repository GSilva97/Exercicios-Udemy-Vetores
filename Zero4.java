package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar?");
        int q = sc.nextInt();
        int[] vetor = new int[q];

        for (int c = 0; c < q; c++) {
            System.out.println("Digite um numero: ");
            vetor[c] = sc.nextInt();
        }
        int qtdPares =0;
        System.out.println("Numeros pares: ");
        for (int c = 0; c < q; c++) {
            int resto = vetor[c] % 2;
            if (resto == 0) {
                qtdPares++;
                System.out.printf("%d ", vetor[c]);

            }
        }
        System.out.printf("\nQuantidade de numeros pares = %d\n ", qtdPares);


        sc.close();
    }
}



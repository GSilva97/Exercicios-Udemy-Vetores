package application.vertorExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Zero1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int q = sc.nextInt();
        int[] vetor = new int[q];

        for (int cont = 0; cont < q; cont++){
            System.out.println("Digite um numero: ");
            vetor[cont] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int cont = 0; cont < q; cont++){
          if (vetor[cont] < 0){
              System.out.printf("%d\n", vetor[cont]);
          }
        }

        sc.close();
    }
}

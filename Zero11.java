package application.vertorExercicios;

import application.vertorExercicios.entity.Zero11Entity;

import java.util.Locale;
import java.util.Scanner;

public class Zero11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int q = sc.nextInt();
        int cP = 1;
        int m = 0;
        double mediaF = 0.0;
        double somaAlturaF = 0.0;
        double meAltura = 0.0;
        double maAltura = 0.0;
        int qF = 0;
        Zero11Entity[] vetor = new Zero11Entity[q];

        for (int c = 0; c < q; c++, cP++) {
            System.out.printf("Altura da %da pessoa: ", cP);
            double altura = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", cP);
            char genero = sc.next().charAt(0);
            vetor[c] = new Zero11Entity(altura, genero);
            System.out.println("----------------");
            if (vetor[c].getGenero() == 'm') {
                m++;
            } else if (vetor[c].getGenero() == 'f') {
                qF++;
                somaAlturaF += vetor[c].getAltura();
                mediaF = somaAlturaF / qF;
            }
        }

        System.out.printf("Média das alturas das mulheres = %.2f \n", mediaF);

        maAltura = vetor[0].getAltura();
        meAltura = vetor[0].getAltura();


        for (int c = 1; c < q; c++) {
            double alturaAtual = vetor[c].getAltura();
            if (alturaAtual > maAltura) {
                maAltura = alturaAtual;
            }
            if (alturaAtual < meAltura) {
                meAltura = alturaAtual;
            }
        }

        System.out.printf("Maior altura = %.2f \n", maAltura);
        System.out.printf("Menor altura = %.2f \n", meAltura);

        System.out.printf("Média das alturas = %.2f\n ", mediaF);
        System.out.println("Número de homens = " + m);

        sc.close();
    }
}


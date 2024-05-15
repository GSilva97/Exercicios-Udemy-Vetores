package application.vertorExercicios;

import application.vertorExercicios.entity.Rent;

import java.util.Locale;
import java.util.Scanner;

public class RentProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] vetor = new Rent[10];
        System.out.println(" How many rooms will be rented? ");
        int qRoom = sc.nextInt();


        for (int c = 1; c <= qRoom; c++){
            System.out.printf("Rent #%d:\n", c);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomN = sc.nextInt();
            vetor [roomN] = new Rent(name, email); //fazendo apontar para a posição do vetor
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int c = 0; c <10; c++) {
            if (vetor[c] != null) {
                System.out.println(c +": " + vetor[c]);
            }
        }

        sc.close();
    }
}

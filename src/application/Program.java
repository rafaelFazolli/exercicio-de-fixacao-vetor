package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students[] bedrooms = new Students[10];

        System.out.println("Digite a quantidade de estudantes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do estudante: ");
            String name = sc.nextLine();
            System.out.println("Digite o email do estudando: ");
            String email = sc.nextLine();
            System.out.print("Digite o número do quarto: ");
            int bedroom = sc.nextInt();

            if(bedrooms[bedroom] == null) {
                bedrooms[bedroom] = new Students(name, email, bedroom);
            } else {
                System.out.println("Quarto ocupado");
            }
        }

        for (Students bedroom : bedrooms) {
            if (bedroom != null) {
                System.out.print(bedroom.toString());
            }
        }

        sc.close();
    }
}

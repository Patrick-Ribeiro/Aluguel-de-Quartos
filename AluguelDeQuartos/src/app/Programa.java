package app;

import entidades.Inquilino;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Inquilino[] aluguel = new Inquilino[10];

        System.out.print("Quantos quartos serão alugados? ");
        int qtdeQuartosAlugados = entrada.nextInt();
        System.out.println();

        for(int i=0; i<qtdeQuartosAlugados; i++){
            int numAluguel = i+1;
            System.out.printf("Aluguel #%d:\n", numAluguel);

            System.out.print("Nome: ");
            entrada.nextLine();
            String nome = entrada.nextLine();

            System.out.print("Email: ");
            String email = entrada.next();

            System.out.print("Quarto: ");
            int numQuarto = entrada.nextInt();
            System.out.println();

            aluguel[numQuarto] = new Inquilino(nome, email, numQuarto);
        }

        System.out.println("Quartos alugados:");
        for(Inquilino quarto : aluguel){
            if(quarto == null)
                continue;
            System.out.println(quarto.toString());
        }
    }
}

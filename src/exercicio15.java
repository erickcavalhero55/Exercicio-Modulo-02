//Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana correspondente a este numero.
//Isto é, domingo se 1, segunda-feira se 2, e assim por diante.

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma número da semana: ");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("O dia da semana é Domingo");
                break;
            case 2:
                System.out.println("O dia da semana é Segunda-Feira");
                break;
            case 3:
                System.out.println("O dia da semana é Terça-Feira");
                break;
            case 4:
                System.out.println("O dia da semana é Quarta-Feira");
                break;
            case 5:
                System.out.println("O  dia da semana é Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia da semana é Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia da semana é Sábado");
                break;


        }
    }
}

//Faça um programa que receba dois numeros e mostre qal deles e o maior.

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O primeiro número é maior " + numero1);
        } else if (numero2> numero1) {
            System.out.println("O segundo número é maior " + numero2);
        }else {
            System.out.println("Os números são iguais. ");
        }
    }
}

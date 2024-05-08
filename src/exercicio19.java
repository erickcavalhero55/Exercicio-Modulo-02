//Faça um programa para verificar se um determinado numero inteiro e divisivel por 3 ou por 5,mas nao simultaniamente pelos os 2.

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if ((numero % 3 == 0 && numero % 5 != 0) || (numero % 3 != 0 && numero % 5 == 0)) {
            System.out.println(numero + " é divisível por 3 ou por 5, mas não pelos dois simultaneamente.");
        } else {
            System.out.println(numero + " não é divisível por 3 ou por 5, ou é divisível pelos dois simultaneamente.");
        }
    }
}

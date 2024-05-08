//Escreva um programa que leia um numero inteiro maior de que zero e devolva na tela, a soma de todos os seus algarismo.
//Por exemplo, ao numero 251 correspondera o valor 8(2+5+1). Se o numero lido nao for maior o qe zero, o programa terminara com a mensagem : Numero invalido.

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro maior que zero:");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. O número deve ser maior que zero.");
            scanner.close();
            return;
        }

        int soma = 0;
        int resto;
        while (numero > 0) {
            resto = numero % 10; // obtem o ultimo digito
            soma += resto; // soma o ultimo digito
            numero /= 10; // remove o ultimo digito
        }

        System.out.println("A soma dos algarismos é: " + soma);

    }
}

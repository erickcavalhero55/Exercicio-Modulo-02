//Leia um numero inteiro. Se o numero lido for negativo escreva a mensagem "numero invalido Se o numero for positivo calcular o logaritmodeste numero

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Deve ser maior ou igual a zero.");
        } else {
            double logaritmo = Math.log(numero);
            System.out.println("O logaritmo de " + numero + " é: " + logaritmo);
        }

    }
}

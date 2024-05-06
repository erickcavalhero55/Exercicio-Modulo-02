//Leia um número fornecido pelo usuário.Se esse número for positivo, calcule a raiz quadrada do número.
//Se o número for negativo, mostre uma mensagem dizendo que o número e inválido.

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();


        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        } else {
            System.out.println("Número inválido. O número deve ser positivo.");
        }


    }
}

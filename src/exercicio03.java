//Leia um número real.Se o número for positivo imprima a raiz quadrada.Do contrario, imprima o numero ao quadrado.

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número real fornecido pelo usuário
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        // Verificação se o número é positivo
        if (numero >= 0) {
            // Cálculo e impressão da raiz quadrada se o número for positivo
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        } else {
            // Cálculo e impressão do quadrado do número se o número for negativo
            double quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        }

    }


}


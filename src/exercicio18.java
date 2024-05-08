//Faça um programa que mostre ao usuario um menu com 4 opções de operações matematicas(as basicas, por exemplo)
//O usuario escolhe umas das opções e o seu programa entao pede dois valores numericos a operação,mostrando o resultado e saindo

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        double numero1, numero2, resultado;

        do {
            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 4) {
                System.out.println("Digite o primeiro número:");
                numero1 = scanner.nextDouble();

                System.out.println("Digite o segundo número:");
                numero2 = scanner.nextDouble();

                switch (escolha) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println("Resultado da soma: " + resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println("Resultado da subtração: " + resultado);
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println("Resultado da multiplicação: " + resultado);
                        break;
                    case 4:
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.println("Resultado da divisão: " + resultado);
                        } else {
                            System.out.println("Não é possível dividir por zero.");
                        }
                        break;
                }
            } else if (escolha != 0) {
                System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (escolha != 0);

        System.out.println("Programa encerrado.");
    }
}

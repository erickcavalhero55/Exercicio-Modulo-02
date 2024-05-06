//Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles, assim como a diferença exixtente entre ambos.


import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();


        int maior = Math.max(numero1, numero2);


        int diferenca = Math.abs(numero1 - numero2);


        System.out.println("O maior número é: " + maior);
        System.out.println("A diferença entre os números é: " + diferenca);


    }
}

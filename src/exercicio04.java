//Faça um programa que leia um número e, se caso ele seja positivo,calcule e mostre o numero ao quadrado , a raiz quadrada do numero digitado.

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número : ");
        double numero = scanner.nextDouble();

        if (numero > 0){
            double quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é " + quadrado);
            double raiz = Math.sqrt(numero);
            System.out.println("a raiz quadrada de " + numero + " é " + raiz);

        }else {
            System.out.println("O número não e positivo");
        }
    }
}

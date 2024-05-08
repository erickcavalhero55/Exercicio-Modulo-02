//Faça um programa que calcule e mostre  a area de um trapezio.Sabendo-se que: a = (basemaior + basemenor)* altura dividio por 2.

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base maior do trapézio:");
        double baseMaior = scanner.nextDouble();

        System.out.println("Digite o valor da base menor do trapézio:");
        double baseMenor = scanner.nextDouble();

        System.out.println("Digite o valor da altura do trapézio:");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + area);
    }
}

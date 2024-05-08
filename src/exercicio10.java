//Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal,utilizando as seguintes formulas onde h corresponde a altura
// homens : (72 * h) - 58   mulher (62,1 * h) -44,7

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite a altura da pessoa em metros:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
        String sexo = scanner.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.0 * altura) - 58.0;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
            scanner.close();
            return;
        }

        System.out.println("O peso ideal para a pessoa é: " + pesoIdeal + " kg");


    }
}

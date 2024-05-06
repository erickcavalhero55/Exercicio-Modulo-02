//Faça um programa que leia 2 notas de um aluno, verifique se as notas são validas e exiba na tela a media desta nota.
//Uma nota valida deve ser, obrigatoriamente, um valor entre 0.0 a 10.00, onde caso a nota não possua um valor valido este fato deve ser informando ao usuario e o programa termina

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Verificação se as notas são válidas
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Uma ou ambas as notas não são válidas. As notas devem ser entre 0.0 e 10.0.");
            // Encerra o programa
            return;
        }

        // Cálculo da média das notas
        double media = (nota1 + nota2) / 2;

        // Exibição da média das notas
        System.out.println("A média das notas é: " + media);

    }
}

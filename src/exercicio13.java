//Faça um algoritmo que calcule a media penderada das notas de 3 provas.A primeira e a segunda tem peso 1 e a terceira tem peso 2.
//Ao final, mostrar a media do aluno e indicar se o aluno foi aprovado ou reprovado.A nota para aprovação deve ser igual ou superior a 60 pontos.

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + (nota3 * 2)) / 3;

        System.out.println("A média do aluno é: " + media);

        if (media >= 60) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

    }
}

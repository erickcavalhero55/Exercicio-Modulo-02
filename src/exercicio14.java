//A nota final de um estudante é calculada a partir de tres  notas  atribuidasentre o intervalo de 0 ate 10, respectivamente, a um trabalho de laboratorio, a uma avaliação semestrale a um exame final.
//A media das tres notas mencionadas anteriormente obedece aos pesos: trabalho em laboratorios:2 ; avaliação semestral:3;exame final: 5.
//De acordo com o resultado, mostre na tela se o aluno esta reprovado (media entre 0 a 2,9)de recuperação( entre 3 e 4,9) ou se foi aprovado
//Faça todas verificação nessesarias.

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório (entre 0 e 10):");
        double trabalho = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (entre 0 e 10):");
        double avaliacao = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (entre 0 e 10):");
        double exame = scanner.nextDouble();

        double media = (trabalho * 2 + avaliacao * 3 + exame * 5) /10;

        System.out.println("A média do aluno é: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 3 && media < 5) {
            System.out.println("Aluno de recuperação.");
        } else if (media >= 5 && media <= 10) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Média inválida. As notas devem estar entre 0 e 10.");
        }
    }
}

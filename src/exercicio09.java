//Leia o salario de um trabalhador e o valor da prestação de um emprestimo.Se a prestação for maior que 20% do salario imprima:
//Emprestimo não concedido, caso contrario imprima: Emprestimo concedido

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sálario do funcionario: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor do emprestimo do funcionario: ");
        double emprestimo = scanner.nextDouble();

        if (emprestimo > (salario * 0.2)) {
            System.out.println("Empréstimo não concedido");
        } else {
            System.out.println("Empréstimo concedido");
        }



    }

}

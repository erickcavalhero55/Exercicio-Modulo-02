//Determine se um determinado ano lido e bissexto.Sendo que um ano e bissexto se for possivel por 400ou se for divisivel por 4 e nao for divisivel por 100
//Por exempo 1988, 1992,1996

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();

        boolean bissexto = (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}

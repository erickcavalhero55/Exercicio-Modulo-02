//Usando switch, escreva um programa que leia um inteiro entre 1 a 12 e imprima o mes correspondente a este numero
//Isto é,janeiro se 1, fevererio se 2,e assim por diante.

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 12:");
        int numero = scanner.nextInt();

        String mes;

        switch (numero) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Número inválido";
                break;
        }

        System.out.println("Mês correspondente: " + mes);
        }
    }

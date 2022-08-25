package lista1_ex1;

import java.util.Scanner;

public class Lista1_ex1 {

    public static void main(String[] args) {

        int option, x, i;
        boolean exit = true;
        Scanner input = new Scanner(System.in);
        while (exit) {
            System.out.println("Informe a Tabuada que Deseja imprimir(1 à 10): ");
            System.out.println("Digite 0 para encerrar o programa");
            System.out.println("Digite uma Opção: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Imprimindo tabuada do 1:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 1;
                        System.out.println(" " + i + " * 1 : " + x + " ");
                        x++;
                        break;
                    }
                case 2:
                    System.out.println("Imprimindo tabuada do 2:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 2;
                        System.out.println(" " + i + " * 2 : " + x + " ");
                        x++;
                        break;
                    }
                case 3:
                    System.out.println("Imprimindo tabuada do 3:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 3;
                        System.out.println(" " + i + " * 3 : " + x + " ");
                        x++;
                        break;
                    }
                case 4:
                    System.out.println("Imprimindo tabuada do 4:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 4;
                        System.out.println(" " + i + " * 4 : " + x + " ");
                        x++;
                    }
                    break;
                case 5:
                    System.out.println("Imprimindo tabuada do 5:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 5;
                        System.out.println(" " + i + " * 5 : " + x + " ");
                        x++;
                    }
                    break;
                case 6:
                    System.out.println("Imprimindo tabuada do 6:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 6;
                        System.out.println(" " + i + " * 6 : " + x + " ");
                        x++;
                    }
                    break;
                case 7:
                    System.out.println("Imprimindo tabuada do 7:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 7;
                        System.out.println(" " + i + " * 7 : " + x + " ");
                        x++;
                    }
                    break;
                case 8:
                    System.out.println("Imprimindo tabuada do 8:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 8;
                        System.out.println(" " + i + " * 8 : " + x + " ");
                        x++;
                    }
                    break;
                case 9:
                    System.out.println("Imprimindo tabuada do 9:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 9;
                        System.out.println(" " + i + " * 9 : " + x + " ");
                        x++;
                    }
                    break;
                case 10:
                    System.out.println("Imprimindo tabuada do 10:");
                    x = 0;
                    for (i = 0; i < 11; i++) {
                        x = i * 10;
                        System.out.println(" " + i + " * 10 : " + x + " ");
                        x++;
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    exit = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}

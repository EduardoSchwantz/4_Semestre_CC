package lista1_ex3;

import java.util.Scanner;

public class Lista1_ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, delta;

        System.out.println("Programa com proposta para calcular o valor de delta.");

        System.out.println("Informe o valor de a: ");
        a = input.nextInt();

        System.out.println("Informe o valor de b: ");
        b = input.nextInt();

        System.out.println("Informe o valor de c: ");
        c = input.nextInt();

        delta = (int) (Math.pow(b, 2) - (4 * a * c));
        
        System.out.println("O valor de delta é: "+ delta + "");
    }

}
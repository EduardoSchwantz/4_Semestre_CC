package lista1_ex2;

import java.util.Scanner;

public class Lista1_ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peso, control;
        boolean exit = true;
        float altura, imc;
        System.out.println("Programa com proposta para calcular o IMC");
        while (exit) {
            System.out.println("Informe seu peso: ");
            peso = input.nextInt();

            System.out.println("Informe sua altura: ");
            altura = input.nextFloat();

            imc = (float) (peso / Math.pow(altura, 2));

            if (imc < 20) {
                System.out.println("Seu índice de massa corporal está < 20 !");
                System.out.println("Portanto você está 'MAGRO' !");
            } else if (imc >= 20 && imc < 25) {
                System.out.println("Seu índice de massa corporal está entre >= 20 e < 25 !");
                System.out.println("Portanto você está 'NORMAL' !");
            } else if (imc >= 25 && imc < 29) {
                System.out.println("Seu índice de massa corporal está entre >= 25 e  < 29 !");
                System.out.println("Portanto você está 'ACIMA DO PESO' !");
            } else if (imc >= 29 && imc < 30) {
                System.out.println("Seu índice de massa corporal está entre >= 29 e  < 30 !");
                System.out.println("Portanto você está 'OBESO' !");
            } else if (imc > 30) {
                System.out.println("Seu índice de massa corporal está > 30 !");
                System.out.println("Portanto você está 'MUITO OBESO' !");
            }
            System.out.println("\n\nPara sair digite 0, para realizar novo cálculo 1: ");
            control = input.nextInt();
            if (control == 0) {
                exit = false;
            }
        }
        System.out.println("Finalizando o Programa...");
    }

}


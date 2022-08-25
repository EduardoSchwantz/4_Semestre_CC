package lista1_ex4;

import java.util.Scanner;

public class Lista1_ex4 {

    /*Faça um programa para calcular a média aritmética de duas notas. Também calcule e apresente a nota
ponderada, considerando peso 2 e 3, respectivamente.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota_A, nota_B, peso_A, peso_B, aux_nota;
        System.out.println("O programa realizará média ponderada de duas notas...");
        System.out.println("Informe a nota de A: ");
        nota_A = input.nextFloat();
        System.out.println("Informe o peso de A: ");
        peso_A = input.nextFloat();
        System.out.println("Informe a nota de B: ");
        nota_B = input.nextFloat();
        System.out.println("Informe o peso de B: ");
        peso_B = input.nextFloat();
        aux_nota = ((nota_A * peso_A) + (nota_B * peso_B) / (peso_A + peso_B));
        System.out.printf("Sua média ponderada é: %.2f\n", aux_nota);
    }

}

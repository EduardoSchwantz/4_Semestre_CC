package lista2_ex1;

import java.util.Scanner;

/*Crie uma classe para representar uma pessoa, com os atributos privados de
nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets
e também um método para imprimir todos dados de uma pessoa. Crie um método para
calcular a idade da pessoa*/
public class Lista2_ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dadosPessoa Pessoa = new dadosPessoa();
        System.out.println("Infome os dados da pessoa!!");
        System.out.println("Nome:");
        Pessoa.setNome(input.nextLine());
        System.out.println("Altura:");
        Pessoa.setAltura(input.nextFloat());
        System.out.println("Data de Nascimento:");
        Pessoa.setData(new Data(input.nextInt(), input.nextInt(), input.nextInt()));

        System.out.println(Pessoa);

    }
}

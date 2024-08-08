package caixa;

import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade: ");
		idade = entrada.nextInt();
		
		if(idade>18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor de idade");
		}
		
	}

}

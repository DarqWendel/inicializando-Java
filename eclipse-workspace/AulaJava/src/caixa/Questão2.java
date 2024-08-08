// Faça um programa que receba um número inteiro, calcule e mostre o dobro


package caixa;
import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, dobro;
		
		
		
		System.out.println("Digite o primeiro Número: ");
		n1 = entrada.nextInt();
		
		dobro = n1*2;
		
		System.out.println("O dobro do número é: " + dobro);
		
		
		
		
		
	}

}

package caixa;
import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		int menu;
		
		
		System.out.println("Digite o primeiro número: \n");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: \n");
		n2 = entrada.nextInt();
		
		
				
		System.out.println("Escolha uma opção: \n" + "MENU: \n"	+ "1.Somar \n" + "2.Subtrair \n" + "3.Multiplicar \n" + "4.dividir \n");
		menu = entrada.nextInt();

		switch(menu) {
		
		case 1: System.out.println(n1 +n2); break;
		case 2: System.out.println(n1-n2); break;
		case 3: System.out.println(n1*n2); break;
		case 4: System.out.println(n1/n2); break;
		case 5: default: System.out.println("Opção Invalida"); break;
		}
		
		
	}

}

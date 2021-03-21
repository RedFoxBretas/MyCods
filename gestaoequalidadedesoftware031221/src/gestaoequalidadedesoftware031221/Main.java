package gestaoequalidadedesoftware031221;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// syso + ctrl + espaço
		// pressionar ctrl + f11 para rodar
		// ctrl + shift + f para formatar o codigo
		// estrutura condicional
		// ctrl + shift + O para resolver as importações.

		Scanner rd = new Scanner(System.in);
		System.out.println("informe o numero:");
		int num = rd.nextInt();
		System.out.println("informe o segundo numero : ");
		int num1 = rd.nextInt();
		if(num > num1)
			System.out.println("o primeiro numero é maior ");
		else {
			if(num < num1)
			System.out.println("o segundo numero é maior");
			else
				System.out.println("os numeros sao iguais");
		
		}
	}
}

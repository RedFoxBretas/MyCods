package salário;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		double S = 0, T = 0;
		System.out.println("Escreva seu salario:  ");
		S = rd.nextDouble();
		T = S / 1100;
		System.out.printf("Ele recebe a quantidade de salarios minimos de %.1f%n ", T );
		
	}

}


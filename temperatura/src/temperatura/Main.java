package temperatura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		double C = 0, F = 0;
		System.out.println("Escreva a Temperatura: ");
		C = rd.nextDouble();
		F = (C * 1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é :  \n" + F);
		
		
	}

}



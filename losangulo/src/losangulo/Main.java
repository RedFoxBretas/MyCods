package losangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		double d1 = 0, d2 = 0, A = 0;
		System.out.println("Escreva o valor da diagonal maior: ");
		d1 = rd.nextDouble();
		System.out.println("Escreva o valor da diagonal menor: ");
		d2 = rd.nextDouble();
		A = d1 * d2 / 2;
		System.out.println("O valor da área é :  " + A);

	}

}

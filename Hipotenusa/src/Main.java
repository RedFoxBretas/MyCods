import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		int A = 0, B = 0, C = 0;
		System.out.println("Escreva o valor do cateto adjacente: ");
		B = rd.nextInt();
		System.out.println("Escreva o valor do cateto oposto:  ");
		C = rd.nextInt();
		A = (int) (Math.pow(B,2) + Math.pow(C,2));
		System.out.println("O valor da Hipotenusa é : " + Math.sqrt(A));
		
	
	}

}



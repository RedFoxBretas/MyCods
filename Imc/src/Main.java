import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		double Imc = 0, P = 0, A = 0;
		System.out.println("Digite o sua Altura : ");
		A = rd.nextDouble();
		System.out.println("Digite o seu Peso : ");
		P = rd.nextDouble();
		Imc = (P / Math.pow(A,2));
		Imc = Imc * 10000;
		System.out.printf("Seu Imc é : %.2f%n ", Imc);
		if(Imc <= 20) {
			System.out.println("Abaixo do peso!");
		}
		else if( Imc >20 && Imc <= 25) {
			System.out.println("Peso Normal");
		}
		else if( Imc > 25 && Imc <= 30) {
			System.out.println("Voce esta com Sobrepeso!");
		}
		else if(Imc >30 && Imc <=40) {
			System.out.println("Voce esta com Obesidade!");
		}
		else if (Imc >40){
		System.out.println("Voce esta com Obesidade Mórbida!!");	
		}
	}

}



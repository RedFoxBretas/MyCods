package atividadef2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int resp;
		do {
		System.out.println("Digite o numero do execico da lista 2 ou 0 para sair: ");
		System.out.println("1. Questao 1");
		System.out.println("2. Questao 2");
		System.out.println("3. Questao 3");
		System.out.println("4. Questao 4");
		System.out.println("5. Questao 5");
		System.out.println("6. Questao 6");
		System.out.println("7. Questao 7");
		
		resp =  teclado.nextInt();
		
		switch(resp) {
		case 1:
			exercicio1();
			break;
		case 2:
			exercicio2();
			break;
		case 3:
			exercicio3();
			break;
		case 4:
			exercicio4();
			break;
		case 5:
			exercicio5();
			break;
		case 6:
			exercicio6();
			break;
		case 7:
			exercicio7();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Opcao Invalida");
		
		}
		}while(resp!=0);
		
	
	}

	public static void exercicio1() {
	 /**
	    Exercicio 1.
	 1) Em linguagem de programação Java, escreva um algoritmo que leia 
	 os três lados de um triângulo e imprima o tipo de triângulo:
	 
	 a. Equilátero: os três lados são iguais.
	 b. Isósceles: 2 lados são iguais.
	 c. Escaleno: 3 lados diferentes
	 **/
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do primeiro lado: ");
		int lado1 = teclado.nextInt();
		System.out.print("Digite o tamanho do segundo lado: ");
		int lado2 = teclado.nextInt();
		System.out.print("Digite o tamanho do terceiro lado: ");
		int lado3 = teclado.nextInt();
		
		
		if((lado1 == lado2) && (lado1==lado3)) {
			System.out.println("O triangulo eh equilatero");
		}
		else if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			System.out.println("O triangulo eh isoceles");
		}
		else if((lado1 != lado2) || (lado1 != lado3) || (lado2 != lado3)){
			System.out.println("O triangulo eh escaleno");
		}
	}
	public static void exercicio2() {
		/**
		 Exercico 2
		 Em linguagem de programação Java, escreva um algoritmo que receba 3 notas no
	     intervalo [0, 10] de um aluno, calcule e apresente uma mensagem de acordo com 
	     sua média:
		 **/
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, media;
		
		System.out.println("Digite a primeira nota:");
		n1 = teclado.nextInt();
		System.out.println("Digite a segunda nota:");
		n2 = teclado.nextInt();
		System.out.println("Digite a terceira nota:");
		n3 = teclado.nextInt();

		media = ((n1+n2+n3)/3);
		
		if((n1>=0 && n1<=10)&&(n2>=0 && n2<=10)&&(n3>=0 && n3<=10)) {
			if((media >= 0)&&(media<3)) {
				System.out.println("Reprovado");
			
			}else if((media >=3)&&(media<7)) {
				System.out.println("Exame");
			}else {
				System.out.println("Aprovado");
			}
		
		}else {
			System.out.println("Uma das notas eh invalida.");
			}
		}
	public static void exercicio3() {
		
		
		 /**
		 Em linguagem de programação Java, escreva um algoritmo que determine
		 a situação de peso de um indivíduo determinada através do IMC (Índice 
		 de Massa Corpórea). O IMC é definido como a relação entre o peso (em kg) 
		 e o quadrado da Altura (em m) do indivíduo: IMC = PESO / ALTURA2.
		 A situação do peso é indicada na tabela ao lado:
		 **/
		
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
	public static void exercicio4() {
		/**
		 4) Em linguagem de programação Java, implemente um algoritmo que 
		 retorne o valor da função abaixo após receber um valor qualquer 
		 de entrada:
		 **/
		Scanner input = new Scanner(System.in);
        
        int x, r1, r2, r3;
        
        System.out.println ("Digite o valor de X: ");
        x=input.nextInt();
        
        if(x<(-2)){
            
            r1 = (2*x)+2;
            System.out.println ("O resultado de X é: "+r1);
        }
        
         else if(x>=(-2) && x<3){
            
            r2 = 3;
            System.out.println ("O resultado de X é: "+r2);
        }
        
         else if(x>=3){
            
            r3 = x*(-1);
            System.out.println ("O resultado de X é: "+r3);
		}	
	}
	public static void exercicio5(){
		/**
		 * Em linguagem de programação Java, implemente um algoritmo que, informados
		 * três valores X, Y e Z, verifique e informe se eles podem, ou não, ser os
		 * comprimentos dos lados de um triângulo. 
		 * Em um triangulo, cada lado é menor que a soma dos outros dois lados.		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		
		int x,y,z;		
		System.out.println("Informe o valor de x");
		x = teclado.nextInt();
		System.out.println("Informe o valor de y");
		y = teclado.nextInt();
		System.out.println("Informe o valor de z");
		z = teclado.nextInt();
		
		if((x<(y+z)) && (z<(x+z)) && (z<(x+y))) {
			System.out.println("Eh um triangulo");
		}else {
			System.out.println("Nao eh um triangulo");
		}
		
		}
	public static void exercicio6(){
		Scanner teclado = new Scanner(System.in);
		
		int a,b,c;
		double x1,x2;
		int delta;
		
		System.out.println("Informe o valor de a: ");
		a = teclado.nextInt();
		System.out.println("Informe o valor de b: ");
		b = teclado.nextInt();
		System.out.println("Informe o valor de c:");
		c = teclado.nextInt();
		
		if((a == 0) && (b == 0) && (c!=0)) {
			System.out.println("Coeficientes informados incorretamente!");
		}else if((a==0) && (b!=0)) {
			System.out.println("Esta é uma equação de primeiro grau!" );
		}else {
		delta = ((b*b)-(4*a*c));
		
		System.out.println("O valor do delta eh: " + delta);
		
		x1 = ((((b * (-1))+ (Math.sqrt(delta)))/(2*a)));
		x2 = ((((b * (-1))+ ((Math.sqrt(delta)))/(2*a))*(-1)));
		
		System.out.println("O Resultado de X linha 1 eh: "+ x1);
		System.out.println("O Resultado de X linha 2 eh: "+ x2);
		}
		}	
	public static void exercicio7(){
		/**Em linguagem de programação Java, escreva um algoritmo que informe o preço
	 	dos	produtos de uma loja, conforme indicado na tabela abaixo. O algoritmo
	 	deve receber o código do produto como entrada.
		**/
		Scanner teclado = new Scanner(System.in);
		
		int codigo;
		do {
		System.out.println(" ___________");
		System.out.println("|Codigo|        Produto         |");
		System.out.println("+------+------------------------+");
		System.out.println("|   1  |        Sapato          |");
		System.out.println("|   2  |        Bolsa           |");
		System.out.println("|   3  |        Camisa          |");
		System.out.println("|   4  |        Calça           |");
		System.out.println("|   5  |        Blusa           |");
		System.out.println("+-------------------------------+");
		System.out.println("Informe o codigo do produto: ");
		
		codigo = teclado.nextInt();
		
		switch(codigo) {
		 case 1:
			 System.out.println("O valor do sapato eh: R$ 99,99");
			 break;
		 case 2:
			 System.out.println("O valor da bolsa eh: R$ 103,99");
			 break;
		 case 3:
			 System.out.println("O valor da camisa eh: R$ 49,99");
			 break;
		 case 4:
			 System.out.println("O valor da calça eh: R$ 89,72");
			 break;
		 case 5:
			 System.out.println("O valor da blusa eh: R$ 97,35" );
			 break;
		 default:
			 System.out.println("Opcao Invalida");
		}
		}while(codigo!=0);
		}
		
	}

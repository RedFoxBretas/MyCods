import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner rd = new Scanner(System.in);
        double Ar = 0, C = 0, R = 0, V = 0, S = 0;
        boolean exit = true;
        int op;

        do {
            System.out.println("\n(1) O comprimento de uma esfera: "
                    + "\n(2)  �rea de uma esfera: "
                    + "\n(3)  �rea de uma esfera: "
                    + "\n(4) Sair.");
            op = rd.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Escreva o Raio : ");
                    R = rd.nextDouble();
                    C = 2 * 3.14 * R;
                    System.out.println("O comprimento da esfera �:  " + C);
                    break;

                case 2:
                    System.out.print("Escreva o Raio : ");
                    R = rd.nextDouble();
                    Ar = 3.14 * Math.pow(R, 2);
                    System.out.println("A are� � :" + Ar);
                    break;

                case 3:
                    System.out.print("Escreva o Raio : ");
                    R = rd.nextDouble();
                    V = 4 * 3.14 * Math.pow(R, 2);
                    System.out.println("O volume � :" + V);
                    break;

                case 4:
                    System.out.print("\nAt� logo!");
                    exit = false;
                    rd.close();
                    break;

                default:
                    System.out.print("\nOp��o Inv�lida!");
                    exit = true;
                    break;
            }
        }while(exit);      
    }
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * int x = 5;
		 * 
		 * System.out.println("Bom dia");
		 * 
		 * if (x < 0) { 
		 * 	System.out.println("Boa tarde"); 
		 * }
		 * 
		 * System.out.println("Boa noite");
		 */

		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que horas são? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			if (hora < 18) {
				System.out.println("Boa tarde!");
		}
			else {
				System.out.println("Boa noite!");
			}
		
		}		
		
		sc.close();
	}
}

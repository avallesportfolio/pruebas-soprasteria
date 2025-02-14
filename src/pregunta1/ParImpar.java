package pregunta1;

import java.util.Scanner;
//https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

public class ParImpar {

	public static void main(String[] args) {
		int numero = leer_numero();
		
		if (numero % 2 == 0) {
			for(int i = numero; i >= 0; i -=2) {
				System.out.println(i);
			}
		}
		else {
			for(int i = numero; i >= 1; i -=2) {
				System.out.println(i);
			}
		}

	}
	
	public static int leer_numero() {
		Scanner s = new Scanner(System.in); //https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#in
		System.out.println("Escribe un número entero: ");
		int num = s.nextInt();
		s.close();
		return num;
	}
	
	
}

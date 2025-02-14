package pregunta3;

import java.util.Scanner;
//https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

public class CalculoSalario {

	public static double leer_horastrabajadas() {
		Scanner s = new Scanner(System.in);
		double horas = s.nextDouble();	
		return horas;
	}
	
	public static double leer_tarifa() {
		Scanner s = new Scanner(System.in);
		double precio_hora = s.nextDouble();
		s.close();
		return precio_hora;
	}
	
	public static void main(String[] args) {
		
		double sueldo = 0.0;
		
		System.out.println("¿Cuántas horas has trabajado? ");
		double horas_trab = leer_horastrabajadas();
		
		System.out.println("¿Cuál es tu precio por hora? ");
		double precio_h = leer_tarifa();
		
		if(horas_trab > 40) {
			double h_extra = horas_trab - 40;
			sueldo = (40 * precio_h) + (h_extra * (precio_h * 1.5) );
		}
		else {
			sueldo = (horas_trab * precio_h);
		}
		
		System.out.println("Entonces tienes un sueldo de: " + sueldo + "€");
		
	}
}

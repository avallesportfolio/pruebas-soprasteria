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
		double horas_trabajadas = leer_horastrabajadas();
		
		System.out.println("¿Cuál es tu precio por hora? ");
		double tarifa = leer_tarifa();
		
		if(horas_trabajadas > 40) {
			double h_extra = horas_trabajadas - 40;
			sueldo = (40 * tarifa) + (h_extra * (tarifa * 1.5) );
		}
		else {
			sueldo = (horas_trabajadas * tarifa);
		}
		
		System.out.println("Entonces tienes un sueldo de: " + sueldo + "€");
		
	}
}

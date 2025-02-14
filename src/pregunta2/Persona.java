package pregunta2;

import java.util.Random;
//https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

public class Persona {

	int edad;
	char sexo;
	
	public Persona(int edad, char sexo) {
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public static Persona[] leer_Personas() {
		Persona[] listado = new Persona[50];
		Random r = new Random();
		char[] sexo = {'M', 'F'};
		
		//Genero 50 objetos Persona de manera aleatoria
		for(int i = 0; i < 50; i++) {
			int next = r.nextInt(2);
			listado[i] = new Persona(r.nextInt(110), sexo[next]);
		}
		return listado;
	}
	
	public static void main(String[] args) {
		
		int mayores_edad = 0;
		int menores_edad = 0;
		int masc_mayores = 0;
		int fem_menores = 0;
		int fem_total = 0;
		double porc_mayores_total = 0.0;
		double porc_fem_total = 0.0;
		
		
		Persona[] personas = leer_Personas();
		
		//Clasificación de las personas
		for(Persona p : personas) {
			if (p.edad > 18) {
				mayores_edad++;
				if(p.sexo == 'M') { masc_mayores++;}
			}
			else {
				menores_edad++;
				if(p.sexo == 'F') {fem_menores++;}
			}
			if(p.sexo == 'F') {fem_total++;}
			
		}
		//Porcentajes
		porc_mayores_total = ((double)mayores_edad / 50) * 100;
		porc_fem_total = ((double)fem_total / 50) * 100;
		
		System.out.println("Cantidad de personas mayores de edad (18 años o más): " + mayores_edad);
		System.out.println("Cantidad de personas menores de edad: " + menores_edad);
		System.out.println("Cantidad de personas masculinas mayores de edad: " + masc_mayores);
		System.out.println("Cantidad de personas femeninas menores de edad " + fem_menores);
		System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de\r\n"
				+ "personas: " + porc_mayores_total);
		System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de\r\n"
				+ "personas: " + porc_fem_total);
		
	}

}

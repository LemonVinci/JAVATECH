package curso.holamundo;

import java.util.Scanner;

import curso.holamundo.modelo.Auto;
import curso.holamundo.modelo.Fraccion;

public class HelloWorldApp {

	//PRIMER COMENTARIO, WII
	public static void main(String[] args) {
		Integer interes = new Integer(0);
		
		Fraccion f = new Fraccion(3,4);
		Fraccion resultado = f.suma(new Fraccion(5,4));
		
		
		System.out.println( resultado.getNumerador()+ " "+ resultado.getDenominador()  );
	}

}

package curso.holamundo.modelo;

public class Fraccion {
	
	private Integer numerador;

	private Integer denominador;
	//construction
	public Fraccion(Integer n, Integer d) {
		this.setNumerador(n);
		this.setDenominador(d);
	}
	//metodos
	public Fraccion suma(Fraccion f) {
		Fraccion resultadoo = new Fraccion(0,0);
		resultadoo.setNumerador(this.numerador + f.getNumerador());
		
		return resultadoo;
	}
	
	
	//getters y setters
	public Integer getDenominador() {
		return denominador;
	}

	public void setDenominador(Integer denominador) {
		this.denominador = denominador;
	}

	public Integer getNumerador() {
		return numerador;
	}

	public void setNumerador(Integer numerador) {
		this.numerador = numerador;
	}
	
}

package curso.holamundo.modelo;

public class Auto {
	//atributos SON SIEMPRE PRIVADOS
	private String color;
	private String marca;
	private Boolean isWorkingFine;
	private float km;
	
	//metodos constructores
	public Auto() {
		this.color="neutro";
		this.marca=null;
		this.km=0;
		this.isWorkingFine=false;
	}
	//Constructor sobrecargado
	public Auto(String color,Float km,String marca) {
		this.setColor("color");
		this.marca=marca;
		this.km=km;
		this.isWorkingFine=false;
	}
	//constructor copia
	public Auto(Auto coche1) {
		this.color=coche1.color;
		this.marca=coche1.marca;
		this.km=coche1.km;
		this.isWorkingFine=false;
	}
	//metodos de clase
	
	public void enceder(String color) {
		
	}
	
	public void acelerar() {		
		
	}
	
	public void frenar() {
		
	}
		
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void encenderBalizas() {
		
	}

}

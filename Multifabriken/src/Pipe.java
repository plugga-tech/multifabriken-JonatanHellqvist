public class Pipe {

	//Variabler Diameter,Length
	private String produkt = "Pipe";
	private int diameter;//eventuellt låsa till några val
	private int length;

	//Konstruktor
	Pipe(int diameter,int length){
		this.diameter = diameter;
		this.length = length;
	}

	//getters och setters
	public String getProdukt() {
		return produkt;
	}
	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	//En lista Pipes
	
}

import java.util.ArrayList;
import java.util.List;

public class Pipe {

	public static List<Pipe> pipeList = new ArrayList<>();
	//Variabler Diameter,Length
	private String produkt = "Pipe";
	private double diameter;//eventuellt låsa till några val
	private double length;

	//Konstruktor
	Pipe(double diameter,double length){
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
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	//printmetod Pipe.printInfo(pipe)
	public static void printInfo(Pipe pipe){
		System.out.println(
			"\nProdukt: " + pipe.getProdukt() + 
			"\nDiameter: " + pipe.getDiameter() + " mm" + 
			"\nLength: " + pipe.getLength() + " mm");
	}
}

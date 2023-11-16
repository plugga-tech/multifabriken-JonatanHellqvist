import java.util.ArrayList;
import java.util.List;

public class Pipe {

	public static List<Pipe> pipeList = new ArrayList<>();
	
	private String produkt = "Pipe";
	private double diameter;
	private double length;

	Pipe(double diameter,double length){
		this.diameter = diameter;
		this.length = length;
	}

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

	public static void printInfo(Pipe pipe){
		System.out.println(
			"\nProdukt: " + pipe.getProdukt() + 
			"\nDiameter: " + pipe.getDiameter() + " mm" + 
			"\nLength: " + pipe.getLength() + " mm");
	}
}

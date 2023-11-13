import java.util.ArrayList;
import java.util.List;

public class Oatmilk {

	public static List<Oatmilk> oatmilkList = new ArrayList<>();

	//Variabler Fatpercent,Liter
	private String produkt = "Oatmilk";
	private double fatpercent;//eventuellt låsa till några val?
	private int liter;

	//Constructor
	Oatmilk(double fatpercent, int liter) {
		this.fatpercent = fatpercent;
		this.liter = liter;
	}
	//getters och setters
	public double getFatpercent() {
		return fatpercent;
	}

	public void setFatpercent(int fatpercent) {
		this.fatpercent = fatpercent;
	}

	public String getProdukt() {
		return produkt;
	}

	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	//printmetod Oatmilk.printInfo(oatmilk)
	public static void printInfo(Oatmilk oatmilk){
		System.out.println("Produkt: " + oatmilk.getProdukt() + "\nFatpercent: " + oatmilk.getFatpercent() + "\nLiters: " + oatmilk.getLiter());
	}
}

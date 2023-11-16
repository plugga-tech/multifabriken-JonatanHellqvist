import java.util.ArrayList;
import java.util.List;

public class Oatmilk {

	public static List<Oatmilk> oatmilkList = new ArrayList<>();

	private String produkt = "Oatmilk";
	private String fatpercent;
	private int liter;

	Oatmilk(String fatpercent, int liter) {
		this.fatpercent = fatpercent;
		this.liter = liter;
	}
	
	public String getFatpercent() {
		return fatpercent;
	}

	public void setFatpercent(String fatpercent) {
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

	public static void printInfo(Oatmilk oatmilk){
		System.out.println(
			"\nProdukt: " + oatmilk.getProdukt() + 
			"\nFatpercent: " + oatmilk.getFatpercent() + 
			"\nLiters: " + oatmilk.getLiter() + " l");
	}
}

import java.util.ArrayList;
import java.util.List;

public class Candy {

	public static List<Candy> candyList = new ArrayList<>();
	//Variabler Taste,Number
	private String produkt = "Candy";
	private String taste;//eventuellt låsa till några val?
	private int quantity;

	//Constructor
	Candy(String taste,int quantity) {
		this.taste = taste;
		this.quantity = quantity;
	}

	//getters och setters
	public String getTaste() {
		return taste;
	}
	public String getProdukt() {
		return produkt;
	}

	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//printmetod Candy.printInfo(candy)
	public static void printInfo(Candy candy){
		System.out.println("Produkt: " + candy.getProdukt() + "\nTaste: " + candy.getTaste() + "\nQuantity: " + candy.getQuantity());
	}
}

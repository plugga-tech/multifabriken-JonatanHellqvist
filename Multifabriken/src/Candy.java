import java.util.ArrayList;
import java.util.List;

public class Candy {

	public static List<Candy> candyList = new ArrayList<>();
	
	private String produkt = "Candy";
	private String taste;
	private int quantity;

	Candy(String taste,int quantity) {
		this.taste = taste;
		this.quantity = quantity;
	}

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

	public static void printInfo(Candy candy){
		System.out.println(
			"\nProdukt: " + candy.getProdukt() + 
			"\nTaste: " + candy.getTaste() + 
			"\nQuantity: " + candy.getQuantity() + " pcs");
	}
}

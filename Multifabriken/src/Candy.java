public class Candy {

	//Variabler Taste,Number
	String produkt = "Candy";
	String taste;//eventuellt låsa till några val?
	int quantity;

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
	
	//En lista Candys
}

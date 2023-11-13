public class Oatmilk {

	//Variabler Fatpercent,Liter
	private String produkt = "Oatmilk";
	private int fatpercent;//eventuellt låsa till några val?
	private int liter;

	//Constructor
	Oatmilk(int fatpercent, int liter) {
		this.fatpercent = fatpercent;
		this.liter = liter;
	}
	//getters och setters
	public int getFatpercent() {
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
	//En lista Oatmilks
}

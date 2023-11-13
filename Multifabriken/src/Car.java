public class Car {
	
	//Variabler Regnumber,Color,Brand
	String produkt = "Car";
	String regNumber; //lås till 6 siffror?
	String color;
	String brand;

	//Constructor
	Car(String regNumber,String color,String brand){
		this.regNumber = regNumber;
		this.color = color;
		this.brand = brand;
	}

	//getters och setters

	public String getProdukt() {
		return produkt;
	}

	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//En lista Cars
}
	

	

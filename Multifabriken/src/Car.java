import java.util.ArrayList;
import java.util.List;

public class Car {
	
	public static List<Car> carList = new ArrayList<>();

	//Variabler Regnumber,Color,Brand
	private String produkt = "Car";
	private String regNumber; //lås till 6 siffror?
	private String color;
	private String brand;

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

	//printmetod Car.printInfo(car)
	public static void printInfo(Car car){
		System.out.println("\nProdukt: " + car.getProdukt() + "\nBrand: " + car.getBrand() + "\nColor: " + car.getColor() + "\nRegnr: " + car.getRegNumber());
	}
}
	

	

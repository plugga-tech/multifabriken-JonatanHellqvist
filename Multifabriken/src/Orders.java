public class Orders {
	
	public static void orderCar(String regNumber,String color,String brand) {
		Car car = new Car(regNumber,color,brand);
		Car.carList.add(car);
		System.out.println("\n~~ Ordered Car ~~");
	}

	public static void orderCandy(String taste,int quantity) {
		Candy candy = new Candy(taste,quantity);
		Candy.candyList.add(candy);
		System.out.println("\n~~ Ordered Candy~~");
	}

	public static void orderPipe(double diameter,double length) {
		Pipe pipe = new Pipe(diameter,length);
		Pipe.pipeList.add(pipe);
		System.out.println("\n~~ Ordered Pipe~~");
	}

	public static void orderOatmilk(double fatpercent,int liter) {
		Oatmilk oatmilk = new Oatmilk(fatpercent,liter);
		Oatmilk.oatmilkList.add(oatmilk);
		System.out.println("\n~~ Ordered Candy~~");
	}

	public static void printOrders() {
		
		for (Car car1 : Car.carList) {
			Car.printInfo(car1);
		}
		for (Candy candy1 : Candy.candyList) {
			Candy.printInfo(candy1);
		}
		for (Pipe pipe1 : Pipe.pipeList) {
			Pipe.printInfo(pipe1);
		}
		for (Oatmilk oatmilk1 : Oatmilk.oatmilkList) {
			Oatmilk.printInfo(oatmilk1);
		}
	}
}

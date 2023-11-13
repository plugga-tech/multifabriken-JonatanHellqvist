import java.util.ArrayList;
import java.util.List;

public class Orders {
	// En lista Ordered med allt som man har beställt
	public static List<Car>carList = new ArrayList<>();
    public static List<Oatmilk>oatmilkList = new ArrayList<>();
    public static List<Candy>candyList = new ArrayList<>();
    public static List<Pipe>pipeList = new ArrayList<>();
    public static List <String>orderedList = new ArrayList<>();
    
    
        
        //Pipe
        Pipe pipe1 = new Pipe(25, 6100);
        Pipe pipe2 = new Pipe(35, 3200);
        Pipe pipe3 = new Pipe (15,2500);
        // pipeList.add(pipe1);
        // pipeList.add(pipe2);
        // pipeList.add(pipe3);

        //Candy
        Candy candy1 = new Candy("Sour", 55);
        Candy candy2 = new Candy("Sweet", 22);
        Candy candy3 = new Candy("Salty", 35);
        // candyList.add(candy1);
        // candyList.add(candy2);
        // candyList.add(candy3);

        //Car
        Car car1 = new Car("ABC123","black","Volvo");
        Car car2 = new Car("ABC124","red","Saab");
        Car car3 = new Car("ABC125","white","Fiat-uno");
        // carList.add(car1);
        // carList.add(car2);
        // carList.add(car3);

        //Oatmilk

        Oatmilk oatmilk1 = new Oatmilk(2, 5);
        Oatmilk oatmilk2 = new Oatmilk(5, 10);
        Oatmilk oatmilk3 = new Oatmilk(10, 15);
        // oatmilkList.add(oatmilk1);
        // oatmilkList.add(oatmilk2);
        // oatmilkList.add(oatmilk3);

        //test
//         System.out.println("Produkt: " + carList.get(0).getProdukt() + 
//                            "\nBrand: " + carList.get(0).getBrand() + 
//                            "\nColor: " + carList.get(0).getColor() + 
//                            "\nRegnr: " + carList.get(0).getRegNumber());
//         System.out.println("Produkt: " + pipeList.get(0).getProdukt() + 
//                            "\nDiameter: " + pipeList.get(0).getDiameter() + 
//                            "\nLength: " + pipeList.get(0).getLength());
//         System.out.println("Produkt: " + candyList.get(0).getProdukt() + 
//                            "\nTaste: " + candyList.get(0).getTaste() + 
//                            "\nLength: " + candyList.get(0).getQuantity());
//         System.out.println("Produkt: " + oatmilkList.get(0).getProdukt() + 
//                            "\nFatpercent: " + oatmilkList.get(0).getFatpercent() + 
//                            "\nLiter: " + oatmilkList.get(0).getLiter()); 
// 
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // public static List<Car>carList = new ArrayList<>();
    // public static List<Oatmilk>oatmilkList = new ArrayList<>();
    // public static List<Candy>candyList = new ArrayList<>();
    // public static List<Pipe>pipeList = new ArrayList<>();
    // public static List <String>orderedList = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner (System.in);
	boolean run = true;
	int menuchoice = 0;

        while(run) {
            //alternativ
            System.out.println("1: Order Car\n2: Order Candy \n3: Order Pipe \n4: Order Oatmilk \n5: Show Orders \n6: Exit");
        
            if (input.hasNextInt()) {
            menuchoice = input.nextInt();

            } else {
                input.nextLine();
            }
                switch(menuchoice) {
                    
                    case 1:
                    
                    //test
                    System.out.println("Ordered Car");
                    Car car1 = new Car("ABC123", "White", "Volvo");
                    Car.printInfo(car1);
                    Car.carList.add(car1);

                    Car car2 = new Car("ABC124", "Black", "Saab");
                    Car.carList.add(car2);
                    //skapa Car och lägg till i listan för bilar
                    break;

                    case 2:

                    //test
                    System.out.println("Ordered Candy");
                    Candy candy1 = new Candy("Sour", 55);
                    Candy.candyList.add(candy1);
                    //skapa Candy och lägg till i listan för candy
                    break;
                    case 3:
                    System.out.println("Ordered Pipe");
                    //skapa Pipe och lägg till i listan för pipe
                    break;
                    case 4:
                    System.out.println("Ordered Oatmilk");
                    //skapa Oatmilk och lägg till i listan för mjölk
                    break;
                    case 5:
                    System.out.println("Show Orders");

                    //test
                    for (Car car : Car.carList) {
                        Car.printInfo(car);
                    }
                    for (Candy candy : Candy.candyList) {
                        Candy.printInfo(candy);
                    }
                    
                    //Visa hela listan med alla produkter?
                    break;
                    case 6:
                    System.out.println("Exit");
                    //exit
                    break;
                    default:
                    System.out.println("Wrong input, Try again!");
                    break;
                }
        }
    }
}
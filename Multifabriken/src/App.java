import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner (System.in);
	boolean run = true;
	int menuchoice = 0;
    
    int carChoice = 0;
    String carBrand = "";
    String carColor = "";
    String carRegnumber = "";

    int candyChoice = 0;
    String candyTaste = "";
    int candyQuantity = 0;

    double pipeDiameter = 0;
    double pipeLength = 0;
    
    int oatmilkChoice = 0;
    double oatmilkFatPercent = 0;
    int oatmilkLiters = 0;

        while(run) {
            System.out.println(
                "1: Order Car" +
                "\n2: Order Candy" + 
                "\n3: Order Pipe" + 
                "\n4: Order Oatmilk" +
                "\n5: Show Orders" +
                "\n6: Exit");
        
            if (input.hasNextInt()) {
                menuchoice = input.nextInt();

            } else {
                input.nextLine();
                System.out.println("Wrong input");
                
                continue;
            }
            switch(menuchoice) {
                    
                case 1:
                    System.out.println("Select the Car you would like to order" + 
                        "\n1: Volvo 142" +
                        "\n2: Saab 9000" +
                        "\n3: Fiat Uno" +
                        "\n4: Passat" +
                        "\n5: Monstertruck" + 
                        "\n6: Exit");
                    
                    if (input.hasNextInt()) {
                        carChoice = input.nextInt();  
                    } else {
                        input.nextLine();
                        input.nextLine();
                    }
                        switch (carChoice) {    
                            case 1: carBrand = "Volvo 142"; break;
                            case 2: carBrand = "Saab 9000"; break;
                            case 3: carBrand = "Fiat Uno"; break;
                            case 4: carBrand = "Passat"; break;
                            case 5: carBrand = "Monstertruck"; break;
                            case 6: System.out.println("exit"); run = false;
                            default : System.out.println("Wrong input");
                            continue;
                        }
                            System.out.println("Enter the color you would like: ");
                            input.nextLine();
                            carColor = input.nextLine();

                            System.out.println("Please enter registration number format :ABC123: ");
                            carRegnumber = input.nextLine();

                            Car car = new Car(carRegnumber, carColor, carBrand);
                            Car.carList.add(car);
                break;
                case 2:
                    System.out.println("Select the Candy you would like to order" + 
                        "\n1: Sour" +
                        "\n2: Sweet" +
                        "\n3: Salty" +
                        "\n4: Chocolate" +
                        "\n5: Mint" + 
                        "\n6: Exit");

                        if (input.hasNextInt()) {
                            candyChoice = input.nextInt();  
                        } else {
                            input.nextLine();
                        }
                        switch (candyChoice) {    
                            case 1: candyTaste = "Sour"; break;
                            case 2: candyTaste = "Sweet"; break;
                            case 3: candyTaste = "Salty"; break;
                            case 4: candyTaste = "Chocolate"; break;
                            case 5: candyTaste = "Mint"; break;
                            case 6: System.out.println("exit"); run = false;
                            default : System.out.println("Wrong input");
                            continue;
                        }
                        System.out.println("Enter the quantity you would like to order:");
                        if (input.hasNextInt()) {
                            candyQuantity = input.nextInt();

                            Candy candy = new Candy(candyTaste, candyQuantity);
                            Candy.candyList.add(candy);
                        }else {
                            input.nextLine();
                        }       
                break;
                case 3:
                    System.out.println("Enter the diameter of pipe you want to order:");
                    if (input.hasNextDouble()) {
                        pipeDiameter = input.nextDouble();  
                    } else {
                        System.out.println("Wrong input");
                        input.nextLine();
                    }
                        System.out.println("Length of pipe you want to order: ");
                        if (input.hasNextDouble()) {
                            pipeLength = input.nextDouble();  

                            Pipe pipe = new Pipe(pipeDiameter, pipeLength);
                            Pipe.pipeList.add(pipe);
                        } else {
                            input.nextLine();
                        }
                        
                break;
                case 4:
                    System.out.println("Enter the fat percent you want to order:" + 
                        "\n1: 1.5%" +
                        "\n2: 2.5%" +
                        "\n3: 5%" +
                        "\n4: 10%" +
                        "\n5: Exit");
                    if (input.hasNextInt()) {
                        oatmilkChoice = input.nextInt();  
                    } else {
                        input.nextLine();
                    }
                    switch (oatmilkChoice) {    
                        case 1: oatmilkFatPercent = 1.5; break;
                        case 2: oatmilkFatPercent = 2.5; break;
                        case 3: oatmilkFatPercent = 5; break;
                        case 4: oatmilkFatPercent = 10; break;
                        case 5: System.out.println("exit"); run = false;
                        default : System.out.println("Wrong input");
                        continue;
                    }
                        System.out.println("How many liters do you want to order?:");
                        if (input.hasNextInt()) {
                            oatmilkLiters = input.nextInt();
                            Oatmilk oatmilk = new Oatmilk(oatmilkFatPercent, oatmilkLiters);
                            Oatmilk.oatmilkList.add(oatmilk);
                        }else {
                            input.nextLine();
                        }   
                break;
                case 5:
                    System.out.println("Show Orders\n");
                    
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
                        
                break;
                case 6:
                    System.out.println("Exit");
                    run = false;
                break;
                default:
                    System.out.println("Wrong input, Try again!");
                break;
            }
        }
    }
}
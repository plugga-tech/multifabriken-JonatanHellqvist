import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner (System.in);
	boolean run = true;
	int menuChoice = 0;
    
    String carBrand = "";
    String carColor = "";
    String carRegnumber = "";

    String candyTaste = "";
    int candyQuantity = 0;

    double pipeDiameter = 0;
    double pipeLength = 0;

    double oatmilkFatPercent = 0;
    int oatmilkLiters = 0;

        while(run) {

            Menu.printIndexMenu();
            menuChoice = Menu.checkInt(input);
           
            switch(menuChoice) {
                    
                case 1:
                    Menu.printCarMenu();
                    menuChoice = Menu.checkInt(input);

                    //TODO - SWITCH METOD - GÄRNA EN GEMENSAM
                        switch (menuChoice) {    
                            case 1: carBrand = "Volvo 142"; break;
                            case 2: carBrand = "Saab 9000"; break;
                            case 3: carBrand = "Fiat Uno"; break;
                            case 4: carBrand = "Passat"; break;
                            case 5: carBrand = "Monstertruck"; break;
                            case 6: System.out.println("\nBack"); continue; 
                            default : System.out.println("\nWrong input, Try again!"); continue;   
                        }
                        
                        Menu.printCarColorMenu(); 
                        menuChoice = Menu.checkInt(input);
                           
                            switch (menuChoice) {
                                case 1: carColor = "White"; break;
                                case 2: carColor = "Black"; break;
                                case 3: carColor = "Red"; break;
                                case 4: carColor = "Yellow"; break;
                                case 5: carColor = "Blue"; break;
                                case 6: carColor = "Rust"; break;
                                case 7: System.out.println("\nBack"); continue;
                                default: System.out.println("\nWrong input, Try again!"); continue;   
                            }

                            input.nextLine();
                            System.out.println("Please enter registration number format : ABC123 : "); //TODO felhantering, kolla så formatet är korrekt.
                            carRegnumber = input.nextLine();

                            Orders.orderCar(carRegnumber, carColor, carBrand);
                break;
                case 2:
                    Menu.printCandyMenu();
                    menuChoice = Menu.checkInt(input);
                      
                        switch (menuChoice) {    
                            case 1: candyTaste = "Sour"; break;
                            case 2: candyTaste = "Sweet"; break;
                            case 3: candyTaste = "Salty"; break;
                            case 4: candyTaste = "Chocolate"; break;
                            case 5: candyTaste = "Mint"; break;
                            case 6: System.out.println("\nBack"); continue; 
                            default : System.out.println("\nWrong input, Try again!"); continue;
                        }
                        System.out.println("Enter the quantity you would like to order:");

                        if (input.hasNextInt()) { //TODO eventuell metod
                            candyQuantity = input.nextInt();

                            Orders.orderCandy(candyTaste, candyQuantity);
                        }else {
                            input.nextLine();
                        }       
                break;
                case 3:
                    System.out.println("Enter the diameter of pipe you want to order:");
                    pipeDiameter = Menu.checkDouble(input);
                
                    
                        System.out.println("Length of pipe you want to order: ");

                        if (input.hasNextDouble()) { //TODO eventuell metod
                            pipeLength = input.nextDouble();  

                            Orders.orderPipe(pipeDiameter, pipeLength);
                        } else {
                            input.nextLine();
                        }
                        
                break;
                case 4:
                    Menu.printOatmilkMenu();
                    menuChoice = Menu.checkInt(input);
                    
                    switch (menuChoice) {    
                        case 1: oatmilkFatPercent = 1.5; break;
                        case 2: oatmilkFatPercent = 2.5; break;
                        case 3: oatmilkFatPercent = 5; break;
                        case 4: oatmilkFatPercent = 10; break;
                        case 5: System.out.println("\nBack"); continue; 
                        default : System.out.println("\nWrong input, Try again!");  continue;
                    }
                        System.out.println("How many liters do you want to order?:");

                        if (input.hasNextInt()) { //TODO eventuell metod
                            oatmilkLiters = input.nextInt();

                            Orders.orderOatmilk(oatmilkFatPercent, oatmilkLiters);
                        }else {
                            input.nextLine();
                        }   
                break;
                case 5:
                    Orders.printOrders();
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
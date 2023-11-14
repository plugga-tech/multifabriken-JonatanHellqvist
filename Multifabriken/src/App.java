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

    String oatmilkFatPercent = "";
    int oatmilkLiters = 0;

    String [] carBrands = {"Volvo 142", "Saab 9000", "Fiat Uno", "Passat" , "Monstertruck", "Stridsvagn M40"};
    String [] carColors = {"White", "Black", "Red", "Yellow" , "Blue", "Rust"};
    String [] candyTastes = {"Sour","Sweet","Salty","Chocolate","Mint","Fruity"};
    String [] oatmilkFatPercents = {"1.5%", "2.5%","3.5%","5%", "10%","15%"};

    System.out.println("\nWelcome to the Multifactory");
        while(run) {
            Menu.printMenu(Menu.indexMenuList);
            //Menu.printIndexMenu();
            menuChoice = Menu.checkInt(input);
           
            switch(menuChoice) {
                    
                case 1:
                    Menu.printMenu(Menu.carMenuList);
                    //Menu.printCarMenu();
                    menuChoice = Menu.checkInt(input);

                        carBrand =  Menu.printSwitch(menuChoice, carBrands); 
                            if (carBrand.equals("backOrError")) {
                                continue;
                            }
                    Menu.printMenu(Menu.carColorMenuList);
                    //Menu.printCarColorMenu(); 
                    menuChoice = Menu.checkInt(input);
                              
                        carColor = Menu.printSwitch(menuChoice, carColors);
                            if (carColor.equals("backOrError")) {
                                continue;
                            }
                            input.nextLine();

                    System.out.println("Please enter registration number format : ABC123 : "); //TODO felhantering, kolla så formatet är korrekt.
                        carRegnumber = input.nextLine();
                    
                        Orders.orderCar(carRegnumber, carColor, carBrand);
                break;

                case 2:
                    Menu.printMenu(Menu.candyMenuList);
                    //Menu.printCandyMenu();
                    menuChoice = Menu.checkInt(input);
                      
                        candyTaste = Menu.printSwitch(menuChoice, candyTastes);
                            if (candyTaste.equals("backOrError")) {
                                continue;
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
                    Menu.printMenu(Menu.oatmilkMenuList);
                    //Menu.printOatmilkMenu();
                    menuChoice = Menu.checkInt(input);
                    
                        oatmilkFatPercent = Menu.printSwitch(menuChoice, oatmilkFatPercents);
                            if (oatmilkFatPercent.equals("backOrError")) {
                                continue;
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
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner (System.in);
	boolean run = true;
	int menuChoice = 0;
    
    String carBrand = "";
    String [] carBrands = {"Volvo 142", "Saab 9000", "Fiat Uno", "Passat" , "Monstertruck", "Stridsvagn M40"};
    String carColor = "";
    String [] carColors = {"White", "Black", "Red", "Yellow" , "Blue", "Rust"};
    String carRegnumber = "";

    String candyTaste = "";
    String [] candyTastes = {"Sour","Sweet","Salty","Chocolate","Mint","Fruity"};
    int candyQuantity = 0;

    double pipeDiameter = 0;
    double pipeLength = 0;

    String oatmilkFatPercent = "";
    String [] oatmilkFatPercents = {"1.5%", "2.5%","3.5%","5%", "10%","15%"};
    int oatmilkLiters = 0;

    
    
    
    

    System.out.println("\nWelcome to the Multifactory");
        while(run) {
            Menu.printMenu(Menu.indexMenuList);
            menuChoice = Menu.checkInt(input);
           
            switch(menuChoice) {
                    
                //*****CARS*****/
                case 1:

                    //*Select Car */
                    Menu.printMenu(Menu.carMenuList);
                    menuChoice = Menu.checkInt(input);

                        carBrand =  Menu.printSwitch(menuChoice, carBrands); 
                            if (carBrand.equals("backOrError")) {
                                continue;
                            }

                    //*Select Car Color */
                    Menu.printMenu(Menu.carColorMenuList);
                    menuChoice = Menu.checkInt(input);
                              
                        carColor = Menu.printSwitch(menuChoice, carColors);
                            if (carColor.equals("backOrError")) {
                                continue;
                            }
                            input.nextLine();

                    //*Enter Registration */
                    System.out.println("Please enter registration number:\n3 Capital letters followed by 3 numbers 0-9. Example | ABC123 |");
                        while (true) {
                            carRegnumber = input.nextLine();
                            if (carRegnumber.length() == 6 && carRegnumber.matches("[A-Z]{3}\\d{3}")) { // A-Z {3} gånger sen \\d(siffra 0-9) {3} gånger"
                                Orders.orderCar(carRegnumber, carColor, carBrand);//order car om allt stämmer
                        break;

                            } else {
                                System.out.println("* Error * Please check the format for registration number |-> ABC123 <-|");
                            }
                        }
                break;

                //*****CANDY*****/
                case 2:

                    //*Select Candy Taste*/
                    Menu.printMenu(Menu.candyMenuList);
                    menuChoice = Menu.checkInt(input);
                      
                        candyTaste = Menu.printSwitch(menuChoice, candyTastes);
                            if (candyTaste.equals("backOrError")) {
                                continue;
                            }

                    //*Enter Candy Quantity */
                    System.out.println("Enter the quantity you would like to order:");
                    while (true) {
                        
                    
                        if (input.hasNextInt()) { //TODO eventuell metod // kan inte använda checkdouble för objectet skapas här
                            candyQuantity = input.nextInt();
                            if (candyQuantity > 0) {
                            Orders.orderCandy(candyTaste, candyQuantity); //Order candy om allt är korrekt
                            break;
                            } else {
                                System.out.println("* Error - negative input * \nEnter a positive quantity:");
                                input.nextLine();
                            }
                        }else {
                            System.out.println("* Error - Wrong Input *\nPlease Enter the quantity you would like to order:");
                            input.next();
                        }  
                    }     
                break;
                
                //*****PIPE*****/
                case 3:

                    //*Enter Pipe Diameter */
                    System.out.println("Enter the diameter of the pipe you want (10-100mm):");
                    while(true) {
                        pipeDiameter = Menu.checkDouble(input); // kanske onödig men sparar någon rad kod
                            if (pipeDiameter >= 10 && pipeDiameter <= 100) {
                                break;
                            } else if (pipeDiameter < 0) {
                                System.out.println("* Error - Wrong input * \nPlease select a diameter in the interval of 10-100 (mm)");
                            } else {
                                System.out.println("* Incorrect dimensions * \nPlease select a diameter in the interval of 10-100 (mm)");
                            }
                            input.nextLine(); //ligger en input.next i metoden checkdouble vid minusvärde
                    }

                    //*Enter Pipe Length */    
                    System.out.println("Length of pipe 10-6100(mm):");
                    while(true) {
                        if (input.hasNextDouble()){ //TODO eventuell metod // kan inte använda checkdouble för objectet skapas här
                            pipeLength = input.nextDouble();  
                                if (pipeLength >= 10 && pipeLength <= 6100) {
                                    Orders.orderPipe(pipeDiameter, pipeLength); //Order pipe om allt är korrekt
                                    break;
                                } else {
                                    System.out.println("* Incorrect dimensions *\nPlease select a length in the interval of 10-6100 (mm)");
                                    input.nextLine(); //rensa -- måste var NEXTLINE    
                                }
                        } else { 
                            System.out.println("* Error - Wrong Input *\nPlease Enter a length in the interval of 10-6100 (mm)");
                            input.next(); //rensa -- måste vara NEXT  
                        }  
                    }     
                break;

                //*****OATMILK*****/
                case 4:

                    //*Select Oatmilk Fatpercent */
                    Menu.printMenu(Menu.oatmilkMenuList);
                    menuChoice = Menu.checkInt(input);
                    
                        oatmilkFatPercent = Menu.printSwitch(menuChoice, oatmilkFatPercents);
                            if (oatmilkFatPercent.equals("backOrError")) {
                                continue;
                            }

                    //*Enter Oatmilk Liters */
                    System.out.println("Enter how many liters do you want to order?:");
                        while (true) {
                            if (input.hasNextInt()) { //TODO eventuell metod // kan inte använda checkdouble för objectet skapas här
                                oatmilkLiters = input.nextInt();
                                if (oatmilkLiters > 0) {
                                    Orders.orderOatmilk(oatmilkFatPercent, oatmilkLiters); //Order milk om allt är korrekt
                                break;
                                }else {
                                    System.out.println("* Error - Negative input * \nEnter a positive ammount for liters: ");
                                    input.nextLine();
                                }   
                            } else {
                                System.out.println("* Error - Wrong input * \nPlease Enter how many liters you would like to order:");
                                input.next();
                            }
                        }
                break;
                case 5:
                    Orders.printOrders();
                break;
                case 6:
                    System.out.println("Exiting the Multifactory");
                    run = false;
                break;
                default:
                    System.out.println("\n* Error - Wrong input\n* Try again!\n");
                break;
            }
        }
    }
}
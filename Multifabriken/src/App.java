import java.util.Scanner;

//För att skapa en ny produkt:
//
// * Skapa en ny klass med önskade variabler, Måste innehålla en arraylist och en "String produkt" med produktnamnet, -
// en "printInfo",en "orderProdukt" metod i "Orders.java" och en forloop för produktens array i "printOrders" metoden.
// 
// * Lägg till variabler för önskade inputs i main filen "App.java" - 
// (String för menyval med cases(Måste för tillfället vara 6 val, placeras i "Menu.java").
//
// * Vill du använda dig av menyval så skapa önskad meny som en sträng längst upp i "Menu.java"
//
// * Print switch metoden - returnerar "backOrError" för menyvalet back eller error från switch metoderna för att börja om loopen med continue.
// * Lägg sedan till ett nytt case i main switchen med önskade metoder från Menu.java

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner (System.in);
	boolean run = true;
	int menuChoice = 0;
    
    String carBrand = "";
    String [] carBrands = Menu.carBrands;
    String carColor = "";
    String [] carColors = Menu.carColors; 
    String carRegnumber = "";

    String candyTaste = "";
    String [] candyTastes = Menu.candyTastes; 
    int candyQuantity = 0;

    double pipeDiameter = 0;
    double pipeLength = 0;

    String oatmilkFatPercent = "";
    String [] oatmilkFatPercents = Menu.oatmilkFatPercents; 
    int oatmilkLiters = 0;

    System.out.println("\n< Welcome to the Multifactory >");

        while(run) {
            Menu.printMenu(Menu.indexMenuList);
            menuChoice = Menu.checkInt(input);
           
            switch(menuChoice) {
                    
                //*CARS*/
                case 1:

                    //*Select Car */
                    Menu.printMenu(Menu.carMenuList);
                    menuChoice = Menu.checkInt(input);

                        carBrand =  Menu.printSwitch(menuChoice,carBrands); 
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

                    //*Enter Registration Number*/
                    System.out.println("< Please enter registration number >\n< 3 Capital letters followed by 3 numbers 0-9. Example: | ABC123 | >");
                        while (true) {
                            carRegnumber = input.nextLine();
                            if (carRegnumber.length() == 6 && carRegnumber.matches("[A-Z]{3}\\d{3}")) { //(A-Z {3} gånger sen \\d(siffra 0-9) {3} gånger)"
                                Orders.orderCar(carRegnumber, carColor, carBrand);//order car om allt stämmer
                        break;

                            } else {
                                System.out.println("< Error > < Please check the format for registration number |-> ABC123 <-| >");
                            }
                        }
                break;

                //*CANDY*/
                case 2:

                    //*Select Candy Taste*/
                    Menu.printMenu(Menu.candyMenuList);
                    menuChoice = Menu.checkInt(input);
                      
                        candyTaste = Menu.printSwitch(menuChoice, candyTastes);
                            if (candyTaste.equals("backOrError")) {
                                continue;
                            }

                    //*Enter Candy Quantity*/
                    System.out.println("< Enter the quantity you would like to order >");
                    while (true) {
                        
                    
                        if (input.hasNextInt()) { 
                            candyQuantity = input.nextInt();
                            if (candyQuantity > 0) {
                            Orders.orderCandy(candyTaste, candyQuantity); //Order candy om allt är korrekt
                            break;
                            } else {
                                System.out.println("< Error - negative input > \n< Enter a positive quantity >");
                                input.nextLine();
                            }
                        }else {
                            System.out.println("< Error - Wrong Input >\n< Please Enter the quantity you would like to order >");
                            input.next();
                        }  
                    }     
                break;
                
                //*PIPE*/
                case 3:

                    //*Enter Pipe Diameter */
                    System.out.println("< Enter the diameter of the pipe you want (10-100mm) >");
                    while(true) {
                        pipeDiameter = Menu.checkDouble(input); 
                            if (pipeDiameter >= 10 && pipeDiameter <= 100) {
                                break;
                            } else if (pipeDiameter < 0) {
                                System.out.println("< Error - Wrong input > \n< Please select a diameter in the interval of 10-100 (mm) >");
                            } else {
                                System.out.println("< Incorrect dimensions > \n< Please select a diameter in the interval of 10-100 (mm) >");
                            }
                            input.nextLine(); //ligger en input.next i metoden checkdouble vid minusvärde.
                    }

                    //*Enter Pipe Length */    
                    System.out.println("< Length of pipe 10-6100(mm) >");
                    while(true) {
                        if (input.hasNextDouble()){ 
                            pipeLength = input.nextDouble();  
                                if (pipeLength >= 10 && pipeLength <= 6100) {
                                    Orders.orderPipe(pipeDiameter, pipeLength); //Order pipe om allt är korrekt
                                    break;
                                } else {
                                    System.out.println("< Incorrect dimensions >\n< Please select a length in the interval of 10-6100 (mm) >");
                                    input.nextLine();    
                                }
                        } else { 
                            System.out.println("< Error - Wrong Input >\n< Please Enter a length in the interval of 10-6100 (mm) >");
                            input.next();  
                        }  
                    }     
                break;

                //*OATMILK*/
                case 4:

                    //*Select Oatmilk Fatpercent */
                    Menu.printMenu(Menu.oatmilkMenuList);
                    menuChoice = Menu.checkInt(input);
                    
                        oatmilkFatPercent = Menu.printSwitch(menuChoice, oatmilkFatPercents);
                            if (oatmilkFatPercent.equals("backOrError")) {
                                continue;
                            }

                    //*Enter Oatmilk Liters */
                    System.out.println("< Enter how many liters do you want to order? >");
                        while (true) {
                            if (input.hasNextInt()) { 
                                oatmilkLiters = input.nextInt();
                                if (oatmilkLiters > 0) {
                                    Orders.orderOatmilk(oatmilkFatPercent, oatmilkLiters); //Order milk om allt är korrekt
                                break;
                                }else {
                                    System.out.println("< Error - Negative input >\n< Enter a positive ammount for liters >");
                                    input.nextLine();
                                }   
                            } else {
                                System.out.println("< Error - Wrong input >\n< Please Enter how many liters you would like to order >");
                                input.next();
                            }
                        }
                break;
                case 5:
                    Orders.printOrders();
                break;
                case 6:
                    System.out.println("< Exiting the Multifactory >");
                    run = false;
                break;
                default:
                    System.out.println("\n< Error - Wrong input >\n< Try again! >\n");
                break;
            }
        }
    }
}
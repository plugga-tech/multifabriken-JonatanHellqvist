
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static List<Car>carList = new ArrayList<>();
    public static List<Oatmilk>oatmilkList = new ArrayList<>();
    public static List<Candy>candyList = new ArrayList<>();
    public static List<Pipe>pipeList = new ArrayList<>();
    public static List <String>orderedList = new ArrayList<>();
    
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
                    System.out.println("Ordered Car");
                    //skapa Car och lägg till i listan för bilar
                    break;
                    case 2:
                    System.out.println("Ordered Candy");
                    //skapa Candy och lägg till i listan för bilar
                    break;
                    case 3:
                    System.out.println("Ordered Pipe");
                    //skapa Pipe och lägg till i listan för bilar
                    break;
                    case 4:
                    System.out.println("Ordered Oatmilk");
                    //skapa Oatmilk och lägg till i listan för bilar
                    break;
                    case 5:
                    System.out.println("Show Orders");
                    //Visa hela listan med alla produkter
                    break;
                    case 6:
                    System.out.println("Exit");
                    //exit
                    break;
                    default:
                    System.out.println("Wrong input");
                    break;
                }
        }
    }
}
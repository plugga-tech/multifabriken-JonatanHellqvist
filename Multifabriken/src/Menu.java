import java.util.Scanner;

public class Menu {
//**********Meny metoder*********/

	public static String [] indexMenuList = 
	{"Please select one of the alternatives\n",
	"1: Order Car", "2: Order Candy", "3: Order Pipe", "4: Order Oatmilk", "5: Show Orders", "6: Exit",};
	public static String [] carMenuList = 
	{"Select the Car you would like to order\n",
	"1: Volvo 142", "2: Saab 9000", "3: Fiat Uno", "4: Passat", "5: Monstertruck", "6: Stridsvagn M40", "7: Back"};
	public static String [] carColorMenuList = 
	{"Select the Color you want\n",
	"1: White", "2: Black", "3: Red", "4: Yellow", "5: Blue", "6: Rust", "7: Back"};
	public static String [] oatmilkMenuList = 
	{"Enter the fat percent you want to order\n",
	"1: 1.5%", "2: 2.5%", "3: 3.5%", "4: 5%", "5: 10%", "6: 15%", "7: Back"};
	public static String [] candyMenuList = 
	{"Select the Candy you would like to order\n",
	"1: Sour", "2: Sweet", "3: Salty", "4: Chocolate", "5: Mint", "6: Fruity", "7: Back"};
	
	public static void printMenu(String[] menuString) {
		for (String item : menuString) {
			System.out.println(item);
		}
	}
	
//***Check Metoder****/

	public static int checkInt(Scanner input) {	
		int intToCheck;
		if(input.hasNextInt()) {
			intToCheck = input.nextInt();
		} else {
			input.next();
			intToCheck = -1; //minusvärde för att forcera fram ett default resultat i switchen och ge ett felmeddelande
		}	
		return intToCheck;
	}

	public static double checkDouble(Scanner input) {	
		double doubleToCheck;
		if(input.hasNextDouble()) {
			doubleToCheck = input.nextDouble();
		} else {
			input.next();
			doubleToCheck = -1; //minusvärde för att forcera fram ett default resultat i switchen och ge ett felmeddelande
		}	
		return doubleToCheck;
	}

//******SWITCH*******

public static String printSwitch(int menuChoice,String [] caseOptions) {
	String selectedCase = "";
	switch (menuChoice) {
		case 1: selectedCase = caseOptions[0]; break;
		case 2: selectedCase = caseOptions[1]; break;
		case 3: selectedCase = caseOptions[2]; break;
		case 4: selectedCase = caseOptions[3]; break;
		case 5: selectedCase = caseOptions[4]; break;
		case 6: selectedCase = caseOptions[5]; break;
		case 7: System.out.println("\nBack"); return "backOrError";
		default: System.out.println("\nWrong input, Try again!"); return "backOrError";		
	}
	return selectedCase;
}

}
	
	
	
	// public static void printIndexMenu () {
	// 	System.out.println(
	// 		"\nWelcome to the Multifactory. Please select one of the alternatives" +
    //         "\n1: Order Car" +
    //         "\n2: Order Candy" + 
    //         "\n3: Order Pipe" + 
    //         "\n4: Order Oatmilk" +
    //         "\n5: Show Orders" +
    //         "\n6: Exit");
	// }
	
	// public static void printCarMenu() {
	// 	System.out.println(
	// 		"\nSelect the Car you would like to order" + 
    //         "\n1: Volvo 142" +
    //         "\n2: Saab 9000" +
    //         "\n3: Fiat Uno" +
    //         "\n4: Passat" +
    //         "\n5: Monstertruck" + 
	// 		"\n6: Stridsvagn M40" +
    //         "\n7: Back");
	// }

	// public static void printCarColorMenu() {
	// 	System.out.println(
	// 		"\nSelect the Color you want" + 
    //         "\n1: White" +
    //         "\n2: Black" +
    //         "\n3: Red" +
    //         "\n4: Yellow" +
    //         "\n5: Blue" + 
	// 		"\n6: Rust" +
    //         "\n7: Back");
	// }

	// public static void printCandyMenu() {
	// 	System.out.println(
	// 		"\nSelect the Candy you would like to order" + 
    //         "\n1: Sour" +
    //         "\n2: Sweet" +
    //         "\n3: Salty" +
    //         "\n4: Chocolate" +
    //         "\n5: Mint" + 
    //         "\n6: Fruity" +
	// 		"\n7: Back");
	// }
	
	// public static void printOatmilkMenu() {
	// 	System.out.println(
	// 		"\nEnter the fat percent you want to order:" + 
	// 		"\n1: 1.5%" +
	// 		"\n2: 2.5%" +
	// 		"\n3: 3.5%" +
	// 		"\n4: 5%" +
	// 		"\n5: 10%" +
	// 		"\n6: 15%" +
	// 		"\n7: Back");
	// }




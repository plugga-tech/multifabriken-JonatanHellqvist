import java.util.Scanner;

public class Menu {

	//*****Menyval*****/
	public static String [] indexMenuList = 
	{"\n< Please select one of the alternatives >\n",
	"1: Order Car", "2: Order Candy", "3: Order Pipe", "4: Order Oatmilk", "5: Show Orders", "6: Exit",};
	public static String [] carMenuList = 
	{"< Select the Car you would like to order >\n",
	"1: Volvo 142", "2: Saab 9000", "3: Fiat Uno", "4: Passat", "5: Monstertruck", "6: Stridsvagn M40", "7: Back"};
	public static String [] carColorMenuList = 
	{"< Select the Color you want >\n",
	"1: White", "2: Black", "3: Red", "4: Yellow", "5: Blue", "6: Rust", "7: Back"};
	public static String [] oatmilkMenuList = 
	{"< Enter the fat percent you want to order >\n",
	"1: 1.5%", "2: 2.5%", "3: 3.5%", "4: 5%", "5: 10%", "6: 15%", "7: Back"};
	public static String [] candyMenuList = 
	{"< Select the Candy you would like to order >\n",
	"1: Sour", "2: Sweet", "3: Salty", "4: Chocolate", "5: Mint", "6: Fruity", "7: Back"};
	
	public static void printMenu(String[] menuString) {
		for (String item : menuString) {
			System.out.println(item);
		}
	}
	//******SWITCH*******

	public static String [] carBrands = {"Volvo 142", "Saab 9000", "Fiat Uno", "Passat" , "Monstertruck", "Stridsvagn M40"};
	public static String [] carColors = {"White", "Black", "Red", "Yellow" , "Blue", "Rust"};
	public static String [] candyTastes = {"Sour","Sweet","Salty","Chocolate","Mint","Fruity"};
	public static String [] oatmilkFatPercents = {"1.5%", "2.5%","3.5%","5%", "10%","15%"};

	public static String printSwitch(int menuChoice,String [] caseOptions) {
		String selectedCase = "";
		switch (menuChoice) {
			case 1: selectedCase = caseOptions[0]; break;
			case 2: selectedCase = caseOptions[1]; break;
			case 3: selectedCase = caseOptions[2]; break;
			case 4: selectedCase = caseOptions[3]; break;
			case 5: selectedCase = caseOptions[4]; break;
			case 6: selectedCase = caseOptions[5]; break;
			case 7: System.out.println("\nBack"); return "backOrError"; //"hantera med if sats med continue om selectedCase = backOrError"
			default: System.out.println("\n< Wrong input, Try again! >"); return "backOrError";		
		}
		return selectedCase;
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
}




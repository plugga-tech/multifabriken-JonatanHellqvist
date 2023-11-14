import java.util.Scanner;

public class Menu {
	//**********Meny metoder*********/

	public static int checkInt(Scanner input) {	
		int intToCheck;
		if(input.hasNextInt()) {
			intToCheck = input.nextInt();
		} else {
			input.next();
			intToCheck = -1;
		}	
		return intToCheck;
	}

	public static double checkDouble(Scanner input) {	
		double doubleToCheck;
		if(input.hasNextDouble()) {
			doubleToCheck = input.nextDouble();
		} else {
			input.next();
			doubleToCheck = -1;
		}	
		return doubleToCheck;
	}

	public static void printIndexMenu () {
		System.out.println(
            "\n1: Order Car" +
            "\n2: Order Candy" + 
            "\n3: Order Pipe" + 
            "\n4: Order Oatmilk" +
            "\n5: Show Orders" +
            "\n6: Exit");
	}
	
	public static void printCarMenu() {
		System.out.println(
			"\nSelect the Car you would like to order" + 
            "\n1: Volvo 142" +
            "\n2: Saab 9000" +
            "\n3: Fiat Uno" +
            "\n4: Passat" +
            "\n5: Monstertruck" + 
            "\n6: Back");
	}

	public static void printCarColorMenu() {
		System.out.println(
			"\nSelect the Color you want" + 
            "\n1: White" +
            "\n2: Black" +
            "\n3: Red" +
            "\n4: Yellow" +
            "\n5: Blue" + 
			"\n6: Rust" +
            "\n7: Back");
	}

	public static void printCandyMenu() {
		System.out.println(
			"\nSelect the Candy you would like to order" + 
            "\n1: Sour" +
            "\n2: Sweet" +
            "\n3: Salty" +
            "\n4: Chocolate" +
            "\n5: Mint" + 
            "\n6: Back");
	}
	
	public static void printOatmilkMenu() {
		System.out.println(
			"\nEnter the fat percent you want to order:" + 
			"\n1: 1.5%" +
			"\n2: 2.5%" +
			"\n3: 5%" +
			"\n4: 10%" +
			"\n5: Back");
	}
}

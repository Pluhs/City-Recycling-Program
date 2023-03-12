// -------------------------------------------------------
// Assignment 2
// For COMP 248 Section 2222-R – Fall 2022
// --------------------------------------------------------
// Importing the scanner so that the user can input using his keyboard after opening the scanner
import java.util.Scanner;
public class A2_Q1 {

	public static void main(String[] args) {
		// ********************************************************************
		// This program serves as a consultation for the user. It lets him know
		// how to recycle depending on the recycling code he inputs.
		// ********************************************************************
		// Opening the scanner to let the user input the code
		Scanner keyIn = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Welcome to My City Recycling Program:");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\nItem Reclying Code. |--> Item samples");
		System.out.println("-----------------------------------");
		System.out.println("1. |--> [Soft drink bottle/Trash cans]");
		System.out.println("2. |--> [Shampoo bottles/Yogurt containers]");
		System.out.println("3. |--> [Plastic bags]");
		System.out.println("4. |--> [Storage bins/ Brooms/Brushes]");
		System.out.println("5. |--> [Garden hoses/Piping]");
		System.out.println("6. |--> [Carry-out food containers]");
		System.out.println("7. |--> [Plastics straws/Chip bags/coffee pods]");
		System.out.println("8. |--> [cell phone/Computer/Camera/Batteries]");
		System.out.println("9. |--> [TV Remote/Flashlight batteries]");
		System.out.println("10.|--> [Car batteries]");
		System.out.println("11.|--> [Cereal/Snack Cardboard boxes]");
		System.out.println("12.|--> [Newspaper/Books/Wallpaper]");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("\nPlease enter the Reclying Code, from the above, that corresponds to the item you want to recycle: ");
		int code = keyIn.nextInt();
		// Depending on what the user enters, different scenarios can happen. I've put different bounds similar to
		// the ones set in the table. Using if-statements lets me chronologically go through the different bounds
		// and display what is needed for the user to do depending on what the code input was.
		if (code >= -128 && code <= 0)
			{System.out.println("This is a hazardous material.");
			System.out.println("Material required to be put in a hazardous dumpster diving.");
			System.out.println("Kindly check your area for the nearby one.");
			}
		if (code > 0 && code <= 5)
			{System.out.println("This is a Reclycled Plastics item.");
			System.out.println("Item required to be put in the blue household recycling bin.");
			}
		if (code > 5  && code <= 7)
			{System.out.println("This is a Non-Reclycled Plastics item.");
			System.out.println("Item required to be thrown in the garbage can.");
			}
		if (code > 7 && code <= 10)
			{System.out.println("This is a Batteries item.");
			System.out.println("Item required to be thrown in the batteries disposal box.");
			}
		if (code > 10 && code <= 12)
			{System.out.println("This is a Paper item.");
			System.out.println("Item required to be put in the green household recycling bin.");
			}
		if (code > 12 && code <= 127)
			{System.out.println("This item is N/A.");
			System.out.println("Item code not handled by the city recycling system.");
			System.out.println("Kindly check the nearby city(ies) for possible recylcing availability.");
			}
		if (code < -128 || code > 127)
			System.out.println("Error: Your reclycing code is not a valid integer between -128 to 127. Kindly retry again!");
		if (code >= -128 && code <= 127)
			System.out.println("\nThank you for saving the planet!");
		keyIn.close();
	}
}

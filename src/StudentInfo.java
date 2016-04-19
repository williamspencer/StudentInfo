import java.util.Scanner;

public class StudentInfo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String input = "";
		int user = 0;

		String[] names = { "Damien", "Frank", "Aaron", "Chioke", "Celena", "Kim", "Aisha", "Ian", "James", "Kamel" };
		String[] hometown = { "Australia, mate", "Probably Lansing?", "BIG DOG, MI", "Iowa", "Ann Arborz",
				"New Angland", "Gross Point", "Taylor", "Wyandotte", "Jordan" };
		String[] food = { "Apple", "Banana", "Orange", "Grapes", "Kiwi", "Strawberries", "Pear", "Blueberries", "Yams",
				"Potatoes" };
		do {
			System.out.println("Welcome to our Java class.  Which student would you like to learn more about?");
			System.out.print("(enter a number from 1-10): ");
			user = (getRange(1, 10) - 1);

			System.out.println("Student " + (user + 1) + " is " + names[user]);
			System.out.println("What would you like to know about " + names[user] + "?");
			System.out.print("(enter 'hometown' or 'favorite food'): ");
			input = readValidString("hometown", "favorite food");

			if (input.equalsIgnoreCase("hometown")) {
				System.out.println(names[user] + " is from: " + hometown[user]);
			} else if (input.equalsIgnoreCase("favorite food")) {
				System.out.println(names[user] + "'s favorite food is " + food[user]);
			}
			System.out.print("Would you like to know more? (y/n): ");
			input = readValidString("y", "n");

		} while (input.equalsIgnoreCase("y"));
		System.out.println("Thanks, goodbye!");
	}

	public static int readValidInt() {

		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Please enter a valid integer: ");
		}
		int x = scan.nextInt();
		return x;
	}

	public static String readValidString(String x, String y) {
		String z = scan.nextLine();

		while (!(z.equalsIgnoreCase(x) || z.equalsIgnoreCase(y))) {
			System.out.println("That option does not exist.  Please try again.");
			z = scan.nextLine();
		}
		return z;
	}

	public static int getRange(int min, int max) {

		int input = readValidInt();
		scan.nextLine();
		while (input < min || input > max) {
			System.out.println("Please put a number within range!");
			input = readValidInt();
		}
		return input;
	}
}

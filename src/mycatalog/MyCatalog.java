package mycatalog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MyCatalog {
	public static String[] telCatalogNames = new String[50];
	static String[] telCatalogTels = new String[50];

	public MyCatalog() {

	}

	public static void searchTelCatalogNames() {
		System.out.println("Enter a name to search");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.nextLine();

		for (int i = 0; i < telCatalogNames.length; i++) {
			if (telCatalogNames[i] != null) {
				if (telCatalogNames[i].equals(input)) {

					System.out.println(telCatalogNames[i] + "'s number is " + telCatalogTels[i]);
					break;
				}
			} else {
				System.out.println("Name is not in Catalog" + "\n");
				break;

			}
		}
	}

	public static void searchTelCatalogTels() {
		System.out.println("Enter a telephone number to search");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.next();

		for (int i = 0; i < telCatalogTels.length; i++) {
			if (telCatalogTels[i] != null) {
				if (telCatalogTels[i].equals(input)) {

					System.out.println(telCatalogTels[i] + " is " + telCatalogNames[i] + "'s telephone number");
					break;
				}
			} else {
				System.out.println("Telephone number is not in Catalog" + "\n");
				break;

			}
		}
	}

	public static void createEntry() {
		System.out.println("Enter name of new contact");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.nextLine();
		for (int i = 0; i < telCatalogNames.length; i++) {
			if (telCatalogNames[i] == null) {
				telCatalogNames[i] = input;

				System.out.println("Enter number of new contact");
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				String input2 = scan.nextLine();
				for (int j = 0; j < telCatalogTels.length; j++) {
					if (telCatalogTels[i] == null) {
						telCatalogTels[i] = input2;
						MyCatalog.Write();
						System.out.println("New contact succesfully saved" + "\n");

					}

				}
				break;
			}
		}
	}

	public static void UpdateEntryName() {
		System.out.println("Enter name of contact you want to update");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.nextLine();
		for (int i = 0; i < telCatalogNames.length; i++) {
			if (telCatalogNames[i] != null) {
				if (telCatalogNames[i].equals(input)) {

					System.out.println("Enter new name for contact " + telCatalogNames[i]);
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					String input2 = scan.nextLine();
					telCatalogNames[i] = input2;
					MyCatalog.Write();
					System.out.println("Name of contact succesfully updated" + "\n");
					break;
				}
			} else {
				System.out.println("Please enter a valid contact name");
				break;
			}
		}
	}

	public static void UpdateEntryTel() {
		System.out.println("Enter number of contact you want to update");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.nextLine();
		for (int i = 0; i < telCatalogTels.length; i++) {
			if (telCatalogTels[i] != null) {
				if (telCatalogTels[i].equals(input)) {

					System.out.println("Enter new number for contact " + telCatalogNames[i]);
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					String input2 = scan.nextLine();
					telCatalogTels[i] = input2;
					MyCatalog.Write();
					System.out.println("Number of contact succesfully updated" + "\n");
					break;
				}
			} else {
				System.out.println("Please enter a valid contact number");
				break;
			}
		}

	}

	public static void DeleteEntryByName() {
		System.out.println("Enter name of contact you want to delete");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.nextLine();
		for (int i = 0; i < telCatalogNames.length; i++) {
			if (telCatalogNames[i] != null) {
				if (telCatalogNames[i].equals(input)) {
					telCatalogNames[i] = null;
					telCatalogTels[i] = null;
					MyCatalog.Write();
					System.out.println("Contact succesfully deleted" + "\n");
					break;
				}
			} else {
				System.out.println("Please enter a valid contact name");
				break;
			}
		}
	}

	public static void DeleteEntryByTel() {
		System.out.println("Enter number of contact you want to delete");
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		String input = sca.nextLine();
		for (int i = 0; i < telCatalogTels.length; i++) {
			if (telCatalogTels[i] != null) {
				if (telCatalogTels[i].equals(input)) {
					telCatalogNames[i] = null;
					telCatalogTels[i] = null;
					MyCatalog.Write();
					System.out.println("Contact succesfully deleted" + "\n");
					break;
				}
			} else {
				System.out.println("Please enter a valid contact number");
				break;
			}
		}
	}

	public static void Menu() {

		@SuppressWarnings("unused")
		boolean go = true;

		while (go = true) {
			System.out.println("\n" + "PhoneBook");
			System.out.println("Press 1 to search by name");
			System.out.println("Press 2 to search by number");
			System.out.println("Press 3 to create new contact");
			System.out.println("Press 4 to update contact name");
			System.out.println("Press 5 to update contact number");
			System.out.println("Press 6 to delete contact by name");
			System.out.println("Press 7 to delete contact by number");
			System.out.println("Press 8 to see all contacts in PhoneBook");

			@SuppressWarnings("resource")
			Scanner sca = new Scanner(System.in);
			if (sca.hasNextInt()) {
				int input = sca.nextInt();

				switch (input) {
				case 1:
					searchTelCatalogNames();
					break;
				case 2:
					searchTelCatalogTels();
					break;
				case 3:
					createEntry();
					break;
				case 4:
					UpdateEntryName();
					break;
				case 5:
					UpdateEntryTel();
					break;
				case 6:
					DeleteEntryByName();
					break;
				case 7:
					DeleteEntryByTel();
					break;
				case 8:
					printEntries();
					break;
				default:
					System.out.println("Please enter a valid command" + "\n");
					go = true;

				}
			} else

				System.out.println("Please enter a valid command" + "\n");
			go = true;

		}
	}

	public static void readFile(String fileName) {
		try {

			File f = new File(fileName);

			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(f));

			String readLine = "";
			int index = 0;
			while ((readLine = br.readLine()) != null) {

				telCatalogNames[index] = readLine.substring(0, readLine.indexOf(","));
				telCatalogTels[index] = readLine.substring(readLine.indexOf(",") + 1, readLine.length()).trim();
				index++;

			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static void Write() {
		PrintWriter writer;

		try {
			writer = new PrintWriter("bin/mycatalog/telCatalog.txt", "UTF-8");
			int i = 0;
			for (i = 0; i < 50; i++) {
				if (telCatalogNames[i] != null) {
					writer.println(MyCatalog.telCatalogNames[i] + "," + telCatalogTels[i]);
				} else {
					break;
				}
			}
			writer.close();
		} catch (UnsupportedEncodingException | FileNotFoundException ex) {
		}
	}

	public static void printEntries() {
		int i = 0;
		for (i = 0; i < 50; i++) {

			System.out.println(MyCatalog.telCatalogNames[i] + "," + MyCatalog.telCatalogTels[i]);

		}
	}
}

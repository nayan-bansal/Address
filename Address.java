package AddressBook;

import java.util.*;

public class Address {

	
	public static void main (String[] args) {
		
		//Printing Welcom Message
		System.out.println("Welcome to Address Book Developement System");
		
		Information add = new Information();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Press 1 to Add Contact");
		System.out.println("Press 2 to Update a Contact");
		System.out.println("Press 3 to Delete a Contact");
		System.out.println("Press 4 to Exit");
		
		int choice = scan.nextInt();
		int count = 0;
		
		switch(choice) {
		case 1:
			Directory data = new Directory();
			System.out.println("Enter First Name: ");
			data.setFirst_Name(scan.next());
			System.out.println("Enter Last Name: ");
			data.setLast_Name(scan.next());
			System.out.println("Enter Address: ");
			data.setLast_Name(scan.next());
			System.out.println("Enter City ");
			data.setLast_Name(scan.next());
			System.out.println("Enter State ");
			data.setLast_Name(scan.next());
			System.out.println("Enter Zip Code: ");
			data.setLast_Name(scan.next());
			System.out.println("Enter Phone Number: ");
			data.setLast_Name(scan.next());
			System.out.println("Enter Email Address: ");
			data.setLast_Name(scan.next());
			add.addPerson(data);
			count++;
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			if(count == 0)
				System.out.println("The List is empty");
			
			System.out.println("Thank you for Visiting the Address Book");
			break;
		}
		
	
		
	}
}

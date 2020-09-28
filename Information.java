package AddressBook;

import java.util.*;

public class Information {

	Scanner scan = new Scanner(System.in);
	
	private ArrayList<Directory> person = new ArrayList<Directory>();
	
	public ArrayList<Directory> getPerson (){
		return person;	
	}
	
	public void setPerson(ArrayList<Directory> person) {
		this.person=person;
	}

	public void addPerson(Directory data) {
		person.add(data);
	}
	
	public void modifyPerson(String name) {
		for (int i=0; i< person.size();i++) {
			
			Directory data = (Directory)person.get(i);
			if(name.equals(data.getFirst_Name())) {
				System.out.println("Which Details to modify? Choose\n1. First Name\n2. Last Name\n3. Address\n4. City\n5. State\n6. Zip Code\n7. Phone Number\n8. EmailId\n9. Exit");
			int choice  = scan.nextInt();	
			switch(choice) {
			
			case 1:
				System.out.println("Enter new First Name");
				data.setFirst_Name(scan.next());
     		   break;
     	   	
			case 2: 
     	   		System.out.println("Enter new Last Name");
    				data.setLast_Name(scan.next());
    				break;
     	   	case 3: 
     	   		System.out.println("Enter new Address");
    				data.setAddress(scan.next());
    				break;
     	   	case 4: 
     	   		System.out.println("Enter new City");
    				data.setCity_Name(scan.next());
    				break;
     	   	case 5:
     	   		System.out.println("Enter new State");
    				data.setState(scan.next());
    				break;
     	   	case 6:
     	   		System.out.println("Enter new Zip Code");
     	   		data.setZip_Number(scan.nextInt());
     	   		break;
     	   	case 7:
     	   		System.out.println("Enter new Phone Number");
    				data.setPhone_Number(scan.nextLong());
    				break;
     	   	case 8:
     	   		System.out.println("Enter new Email");
    				data.setEmail_Id(scan.next());
    				break;
			}
			}
		}
		
	}
	public void deletePerson(String delete) {
		
		for(int i=0;i<person.size();i++) {
			Directory data = (Directory)person.get(i);
			
			if(delete.equals(data.getFirst_Name())) {
				person.remove(i);
				System.out.println("The Contact with first name "+delete+" is deleted");
				
			}
			
		}
	}
	
} 

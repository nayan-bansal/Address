package AddressBook;

import java.util.*;

public class Information {

	
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
	
	
	
} 

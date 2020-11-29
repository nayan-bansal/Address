package AddressBook;

import java.util.*;

public class Main{

	
	private TreeMap<String, Directory> addressBook=new TreeMap<String, Directory>();
	public TreeMap<String, Directory> getAddressBookDict(){
		return addressBook;
	}
	public void setAddressBookDict(TreeMap<String, Directory> addressBook){
		this.addressBook=addressBook;
	}
	
	public void addAddressBook(String AddressBookName,Directory obj) {
		addressBook.put(AddressBookName,obj);
	}
	

}

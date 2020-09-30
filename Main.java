package AddressBook;

public class Main {

	
	private TreeMap<String, PersonInfo> addressBook=new TreeMap<String, PersonInfo>();
	public TreeMap<String, PersonInfo> getAddressBookDict(){
		return addressBook;
	}
	public void setAddressBookDict(TreeMap<String, PersonInfo> addressBook){
		this.addressBook=addressBook;
	}
	
	public void addAddressBook(String AddressBookName,PersonInfo obj) {
		addressBook.put(AddressBookName,obj);
	}
	

}
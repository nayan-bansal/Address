package AddressBook;

public class Directory {

	
	private String first_Name;
	private String last_Name;
	private String address;
	private String city_Name;
	private String state;
	private int zip_Number;
	private long phone_Number;
	private String email_Id;
	
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name (String first_Name) {
		this.first_Name = first_Name;
	}
	
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip_Number() {
		return zip_Number;
	}
	public void setZip_Number(int zip_Number) {
		this.zip_Number = zip_Number;
	}
	public long getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(long phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
}

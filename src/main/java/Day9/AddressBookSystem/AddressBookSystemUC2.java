package Day9.AddressBookSystem;
import java.util.Scanner;
import java.util.ArrayList;
class AddNewContacts {
	String firstName;
	String lastName; 
	String address;
	String city; 
	String state;
	String zip;
	String phoneNumber;
	String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddNewContacts(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public AddNewContacts get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public void add(AddNewContacts addNewContacts1) {
		// TODO Auto-generated method stub
		
	}
}
public class AddressBookSystemUC2 {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter first name:");
	    String firstName=scanner.next();
		System.out.println("Enter last name:");
	    String lastName=scanner.next();
	    System.out.println("Enter address:");
	    String address=scanner.next();
	    System.out.println("Enter city:");
	    String city=scanner.next();
	    System.out.println("Enter state:");
	    String state=scanner.next();
	    System.out.println("Enter zip:");
	    String zip=scanner.next();
	    System.out.println("Enter phone Number:");
	    String phoneNumber=scanner.next();
	    System.out.println("Enter email:");
	    String email=scanner.next();
		ArrayList<AddNewContacts> addNewContacts= new ArrayList<AddNewContacts>();
		AddNewContacts addNewContacts1=new AddNewContacts("Neeta1", "mourya", "dayalband", "bsp", "cg", "495001", "8269068794","neeta.mourya@bridgelabz.com");
		addNewContacts1.add(addNewContacts1);
		System.out.println(addNewContacts1.get(0).getFirstName());
		System.out.println(addNewContacts1.get(0).getLastName());
		System.out.println(addNewContacts1.get(0).getAddress());
		System.out.println(addNewContacts1.get(0).getCity());
		System.out.println(addNewContacts1.get(0).getState());
		System.out.println(addNewContacts1.get(0).getZip());
		System.out.println(addNewContacts1.get(0).getPhoneNumber());
		System.out.println(addNewContacts1.get(0).getEmail());
		

	}
}

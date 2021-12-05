package Day9.AddressBookSystem;
import java.util.Scanner;
class Contacts{
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

}
public class AddressBookSystemUC1 {
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

	}

}

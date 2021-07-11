import java.util.*;
import java.io.*;

public class Person{
	
	// Class-variable declarations
	private String name, city, state, address, zipCode;
	private long phoneNumber;
	
	public Person(String name, String city, String state, String address, String zipCode, long phoneNumber){
		this.name = name;
		this.city = city;
		this.state = state;
		this.address = address;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	// Methods for modifying class-variables

	/* Note: Modifying name of a Person is not allowed. */
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	// Methods for displaying class-variables
	public String getName(){
		return this.name;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public String getAddress(){
		return this.address;
	}
	public String getZipCode(){
		return this.zipCode;
	}
	public long getPhoneNumber(){
		return this.phoneNumber;
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
	 List<Person> persons = new ArrayList<Person>();
	 
	 public String readString(String displayMessage){

			Scanner sc = new Scanner(System.in);
			System.out.print(displayMessage);
			String input=sc.nextLine();

			return input;
		}
	 
	 public long readLong(String displayMessage){

			Scanner sc = new Scanner(System.in);
			System.out.print(displayMessage);
			long input=sc.nextLong();
			
			return input;
		}
	 

     public void addPerson(Person person) {
             
       //  if(!persons.contains(person)){
         //     persons.add(person);
    	 System.out.println();
 		String name=readString("[+]Enter Person's name: ");
 		String city=readString("[+]Enter where he/she lives first enter City: ");
 		String state=readString("[+]Now, enter State: ");
 		String address=readString("[+]Now, enter full address: ");
 		String zipCode=readString("[+]At last enter, area's Zip Code: ");
 		long phoneNumber=readLong("[+]Enter his/her phone number: ");
 		Person newEntry=new Person(name, city, state, address, zipCode, phoneNumber);

 		this.persons.add(newEntry);
 		System.out.println("\n[*]\t"+name+" added successfully to address book.");
        }
     
     public void runMenu(){

 		long choice=-1;
 		while(choice != 0)
 		{
 			System.out.println();
 			System.out.println("o--------------------Address Book Manager--------------------o");
 			System.out.println("| 1. Add a person");
 			
 			switch((int)choice)
			{
				case 1: addPerson(null);
					break;
				case 8: choice = 0;
				break;
			default: System.out.println("\n[*]\tBad Input!");	
 		}
 	 }
   }
     public void print() {
             for(Person person1 : persons) {
                     System.out.println(persons);
             }
     }
}

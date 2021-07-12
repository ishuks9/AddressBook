import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
	 List<Person> persons = new ArrayList<Person>();
	    Scanner sc = new Scanner(System.in);
	 public String readString(String displayMessage){

			System.out.print(displayMessage);
			String input=sc.nextLine();

			return input;
		}
	 
	 public long readLong(String displayMessage){

			System.out.print(displayMessage);
			long input=sc.nextLong();
			
			return input;
		}
	 
	 public int indexOfPerson(){

			System.out.println();
			String name=readString("[+]Enter Person's name: ");
			long phoneNumber=readLong("[+]Enter his/her phone number: ");

			int index=0;
			for(Person p : this.persons)
			{
				if(p.getName().equals(name) && p.getPhoneNumber()==phoneNumber){
					return index;
				}
				++index;
			}
			return -1;
		}

	  public void editPerson(){

			int index=this.indexOfPerson();

			if(index != -1){
				String options="[+]\tWhat you want to change?\n\t1. City\n\t2. State\n\t3. Address\n\t4. Zip Code\n\t5. PhoneNumber\n: ";
				int choice=(int)readLong(options);

				switch(choice)
				{
					case 1: 
						this.persons.get(index).setCity(readString("[+]Enter new City: "));
						System.out.println("[*]\tEntry Modified");
						break;
					case 2: 
						this.persons.get(index).setState(readString("[+]Enter new State: "));
						System.out.println("[*]\tEntry Modified");
						break;
					case 3: 
						this.persons.get(index).setAddress(readString("[+]Enter new Address: "));
						System.out.println("[*]\tEntry Modified");
						break;
					case 4: 
						this.persons.get(index).setZipCode(readString("[+]Enter new Zip Code: "));
						System.out.println("[*]\tEntry Modified");
						break;
					case 5: 
						this.persons.get(index).setPhoneNumber(readLong("[+]Enter new Phone number: "));
						System.out.println("[*]\tEntry Modified");
						break;
					default:
						System.out.println("\n[*]\tBad Input!");
				}
			}
	  }

     public void addPerson() {
             
       //  if(!persons.contains(person)){
         //     persons.add(person);
    	 
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

 		int edit=-1;
 		while(edit != 0)
 		{
 			
 			System.out.println("o--------------------Address Book Manager--------------------o");
 			System.out.println("| 1. Add a person");
 			System.out.println("| 2. Edit a person");
 			System.out.println("3. To exit");
 			int menu =0;
 			menu =sc.nextInt();
 			
 			switch(menu)
			{
				case 1: addPerson();
					break;
				case 2: editPerson();
				 break;
				case 3: edit= 0;
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




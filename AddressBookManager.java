import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
	 List<Person> persons = new ArrayList<Person>();

     public void addContact(Person person) {
             
         if(!persons.contains(person)){
              persons.add(person);
         }
     }

     public void print() {
             for(Person person1 : persons) {
                     System.out.println(persons);
             }
     }
}

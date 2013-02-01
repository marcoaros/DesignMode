package visitor.objectstructure;

import java.util.ArrayList;
import java.util.List;

import visitor.element.Person;
import visitor.visitor.Action;

public class ObjectStructure {
	
	public List<Person> personList = new ArrayList();
	
	public void addPerson(Person person){
		personList.add(person);
	}
	
	public void removePerson(Person person){
		personList.remove(person);
	}
	
	public void display(Action action){
		for(Person person:personList){
			person.acceptVisitors(action);
		}
	}

}

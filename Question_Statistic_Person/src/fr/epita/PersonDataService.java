package fr.epita;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PersonDataService {
	int averageAge(List<Person> persons) {
		int totalAge = 0;
		for(Person p : persons) {
			totalAge = totalAge+p.getAge();
		}
		
		int avgAge = totalAge/persons.size();
		return avgAge;
	}
	
	List<Person> filter(List<Person> persons, int thresholdAge) {
		List<Person> p1 = new ArrayList<Person>();
		for(Person p : persons) {
			if(p.getAge() > thresholdAge) {
				p1.add(p);
			}
		}
		return p1;
		
	}
	
	int calculateYearOfBirth(Person person) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year-person.getAge();
	}
}

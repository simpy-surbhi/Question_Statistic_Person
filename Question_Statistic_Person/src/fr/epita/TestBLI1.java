package fr.epita;

import java.util.ArrayList;
import java.util.List;

public class TestBLI1 {

	public void test() {
		Person p1 = new Person();
		p1.setAge(12);
		p1.setHeight(56);
		p1.setName("John");
		p1.setSex("male");
		p1.setWeight(30);
		
		Person p2 = new Person();
		p2.setAge(22);
		p2.setHeight(50);
		p2.setName("Mukesh");
		p2.setSex("male");
		p2.setWeight(70);
		
		
		Person p3 = new Person();
		p3.setAge(56);
		p3.setHeight(60);
		p3.setName("Patrick");
		p3.setSex("female");
		p3.setWeight(40);
		
		Person p4 = new Person();
		p4.setAge(64);
		p4.setHeight(40);
		p4.setName("Adam");
		p4.setSex("male");
		p4.setWeight(60);
		
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		PersonDataService dataService = new PersonDataService();
		System.out.println("Average age of person is : "+dataService.averageAge(persons));
		List<Person> person1 = dataService.filter(persons, 32);
		System.out.println("Size of list of persons whose age is more than 32 years :"+person1.size());
		System.out.println("Year of birth : "+dataService.calculateYearOfBirth(p1));
		
	}
}

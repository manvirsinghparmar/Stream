package exampleOfStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		ArrayList<String> manvir = new ArrayList<>();

		manvir.add("Tim");
		manvir.add("Tony");
		manvir.add("Mathew");
		manvir.add("clark");
		manvir.add("John");

		for (String name : manvir) {
			if (name.length() > 5) {
				System.out.println(name);
			}
		}
		
		//Print all names which have a lenth of more than 5
		manvir.stream().filter(a -> a.length() > 5).forEach(System.out::println);

		Person man = new Person("Manvir", 33);
		Person gurvir = new Person("Gurvir", 24);
		Person tony = new Person("Tony", 45);
		Person kailash = new Person("Kailash", 30);
		Person nidhi = new Person("Nidhi", 31);
		Person ram = new Person("Gurvir", 34);

		ArrayList<Person> myList = new ArrayList<>();

		myList.add(man);
		myList.add(gurvir);
		myList.add(tony);
		myList.add(kailash);
		myList.add(nidhi);
		myList.add(ram);

		int count = 0;
		for (Person person : myList) {

			if (person.getName().equals("Gurvir")) {
				count++;
			}

		}

		System.out.println("The count is " + count);

		//To print element based upon the filter criteria
		myList.stream().filter(n -> n.getAge() > 30).forEach(n -> {
			System.out.println(n.getName());
		});

		//To find the size of element
		long count1 = myList.stream().count();

		//To save the elements in an another list based upon filter criteria
		List<Person> list2 = myList.stream().filter(g -> g.getAge() > 30).collect(Collectors.toList());

		System.out.println(list2.get(1).getName());

		//To find the count of same element in a list
		System.out.println(myList.stream().filter(p -> p.getName().equals("Gurvir")).count());

		//To find the age of the first element where name is equal to gurvir
		int ageOfFirstGurvir = myList.stream().filter(p -> p.getName().equals("Gurvir")).findFirst().get().getAge();

		System.out.println(ageOfFirstGurvir);

	

	}

}

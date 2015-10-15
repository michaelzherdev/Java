package ch29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {

	public static void main(String[] args) {
		ArrayList<NamePhoneEmail> list = new ArrayList<NamePhoneEmail>();
		list.add(new NamePhoneEmail("Larry", "555-55-55", "a@mail.com"));
		list.add(new NamePhoneEmail("James", "555-55-44", "b@mail.com"));
		list.add(new NamePhoneEmail("Mary", "555-55-33", "c@mail.com"));
		
		Stream<NamePhone> nameAndPhone = list.stream().map((a) -> new NamePhone(a.name, a.phonenum));
		
		List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
		
		System.out.println("Names in List: ");
		for(NamePhone e : npList)
			System.out.println(e.name + ":" + e.phonenum);
		
		nameAndPhone = list.stream().map((a) -> new NamePhone(a.name, a.phonenum));
		
		Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
		System.out.println("Names in Set: ");
		for(NamePhone e : npSet)
			System.out.println(e.name + ":" + e.phonenum);
		
	}

}

class NamePhoneEmail{
	String name;
	String phonenum;
	String email;
	
	public NamePhoneEmail(String name, String phonenum, String email) {
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
	}
	
}

class NamePhone{
	String name;
	String phonenum;
	
	public NamePhone(String name, String phonenum) {
		this.name = name;
		this.phonenum = phonenum;
	}
	
}

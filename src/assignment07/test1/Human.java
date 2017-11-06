package assignment07.test1;

public class Human {
	public String name;
	
	void walk() {
		System.out.println(name+"在散步");
		
	}
	
	void hit(Dog dog){
		
		System.out.println(name+"打了"+dog.name);
	}

}

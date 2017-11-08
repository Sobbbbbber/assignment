package assignment17.homework;

public class Fruit extends Object {
	public String name;
	public int price;
	public String city;
	
	public Fruit(String name, int price, String city) {
		super();
		this.name = name;
		this.price = price;
		this.city = city;
	}

	@Override
	public int hashCode() {
		return price;
		
	}

	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		if(f.name.equals(this.name) && f.city.equals(this.city)){
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	

}

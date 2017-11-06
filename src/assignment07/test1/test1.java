package assignment07.test1;

public class test1 {
	public static void main(String[] args) {
		Human h = new Human();
		Dog d = new Dog();
		
		h.name="ÕÅÈı";
		d.name="´ó»Æ";
		
		h.walk();
		d.bite(h);
		h.hit(d);
		d.run();
	}

}

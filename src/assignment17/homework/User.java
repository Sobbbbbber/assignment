package assignment17.homework;

import java.util.HashSet;
import java.util.Iterator;

public class User {

	public static void main(String[] args) {
		HashSet<Fruit> hs = new HashSet<Fruit>();
		Fruit f1 = new Fruit("apple",5,"YanTai");
		Fruit f2 = new Fruit("orange",3,"GanNan");
		Fruit f3 = new Fruit("pear",4,"DongBei");
		Fruit f4 = new Fruit("apple",5,"YanTai");
		Fruit f5 = new Fruit("grape",5,"Shanxi");
		
		hs.add(f1);
		hs.add(f2);
		hs.add(f3);
		hs.add(f4);
		hs.add(f5);
		hs.add(f1);
		
		Iterator<Fruit> it = hs.iterator();
		while(it.hasNext()) {
			Fruit f = it.next();
			System.out.println(f.name);
		}
	}
}

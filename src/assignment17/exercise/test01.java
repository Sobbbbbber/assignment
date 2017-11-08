package assignment17.exercise;

import java.util.HashSet;
import java.util.Iterator;


public class test01 {
	public static void main(String[] args) {
		HashSet<Triangle> hs = new HashSet<Triangle>();
		
		Triangle t1 = new Triangle(30,60);
		Triangle t2 = new Triangle(10,80);
		Triangle t3 = new Triangle(40,70);
		Triangle t4 = new Triangle(90,60);
		Triangle t5 = new Triangle(30,60);
		
		
		hs.add(t1);hs.add(t2);hs.add(t3);
		hs.add(t4);hs.add(t5);
		
		Iterator<Triangle> it = hs.iterator();
		while(it.hasNext()) {
			Triangle t = it.next();
			System.out.println(t.minAngle+"  "+t.maxAngle);
		}
		
		
		
	}
	

}

class Triangle extends Object{
	public int minAngle;
	public int maxAngle;
	
	
	public Triangle(int minAngle, int maxAngle) {
		super();
		this.minAngle = minAngle;
		this.maxAngle = maxAngle;
	}


	@Override
	public int hashCode() {
		
		return minAngle;
	}


	@Override
	public boolean equals(Object obj) {
		Triangle tri = (Triangle) obj;
		if(tri.maxAngle == this.maxAngle) {
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	
}

package assignment15.homework;

import java.util.ArrayList;

public class User {
	public static void main(String[] args) {
		ArrayList<Computer> cList = new ArrayList<Computer> ();
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		c1.mac = 20171101;
		c1.price=8000;	
		c2.mac = 20171103;
		c2.price=9000;	
		c3.mac = 20171103;
		c3.price=3000;
		
		 
		 cList.add(c1);	 cList.add(c2);	 cList.add(c3);
		Computer temp = new Computer();
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(i);
			temp = cList.get(i);
			temp.show(temp);
		}
		
		
	}

}

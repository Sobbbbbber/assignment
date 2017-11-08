package assignment15.exercise;

import java.util.ArrayList;

public class test01 {
	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<Integer>();
		int a = 0;
		for (int i = 0; i < 20; i++) {
		//	System.out.println(Math.random());
			a = (int)(Math.random()*200+1);
		//	System.out.println(a);
			iList.add(a);
		}
		for (int i = 0; i < iList.size(); i++) {
			System.out.print(iList.get(i)+" ");
		}
		System.out.println();
		int b = 0;
		int c = 0;

		for (int i = 0; i < iList.size(); i++) {
			for (int j = 0; j < iList.size()-1-i; j++) {
				b=iList.get(j);
				c=iList.get(j+1);
				if(b>c) {
					
					iList.set(j, c);
					iList.set(j+1, b);
				}
				
			}
			
		}
		for (int i = 0; i < iList.size(); i++) {
			System.out.print(iList.get(i)+" ");
		}
			
	}

}

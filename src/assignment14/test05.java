package assignment14;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		System.out.println("please input the String!");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int count = 0;	
		
		for (int i = 0; i < str.length()-1; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(i+1);
			if(c1 == 'жа' && c2 == 'Йњ') {
				count ++;
			}
		}	
		
		System.out.println("totally have(China):"+count);
		s.close();
	}

}

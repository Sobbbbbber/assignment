package assignment14;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		System.out.println("please input the String!");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		if(str.startsWith("a")) {
			System.out.println(str);
		}
		else if(str.startsWith("b")) {
			System.out.println(str);
			System.out.println(str);
		}
		else if(str.startsWith("exit")) {
			System.out.println("exit the system");
		}
		
		
		
		
		
		s.close();
	}

}

package assignment14;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		System.out.println("please input the String!");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		while(! isExit(str)) {
			
			System.out.println("please input the String!");
			str = s.nextLine();
			
		}
		
		
		s.close();
		
	}
	
	static boolean isExit(String str) {
		if(str.toLowerCase().equals("exit")) {
			System.out.println("Exit the system!");
			return true;
		}
		return false;
	}

}

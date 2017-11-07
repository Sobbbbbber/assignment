package assignment14;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		System.out.println("please input the String!");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		while(! isLeagal(str)) {
			
			System.out.println("please input the String!");
			str = s.nextLine();
			
		}
		
		System.out.println("the string is leagal!");

		s.close();
		
	}
	
	static boolean isLeagal(String str) {
		if(str.toLowerCase().endsWith("a")) {
			return true;
		}
		return false;
	}


}

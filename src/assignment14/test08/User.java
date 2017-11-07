package assignment14.test08;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		System.out.println("please input the String!");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		Tools t = new Tools();
		if(t.isAdmin(str)) {
			System.out.println("Hello,Administrator!");
		}else {
			System.out.println("Hello,common user!");
		}
	}

}

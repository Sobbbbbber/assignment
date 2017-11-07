package assignment14;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		System.out.println("please input the String!");

		Scanner s1 = new Scanner(System.in);
		String str1 = s1.nextLine();		
		Scanner s2 = new Scanner(System.in);
		String str2 = s2.nextLine();
		
		if(str1.toLowerCase().compareTo(str2.toLowerCase()) < 0) {
			System.out.println(str1);
		}else {
			System.out.println(str2);
		}
		
	}

}

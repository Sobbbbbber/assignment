package assignment03;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		
		System.out.println("please input a num:");
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		
		if(m%3==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		s.close();
		
	}

}

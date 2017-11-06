package assignment03;

import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		System.out.println("please input two nums:");
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		int m = s1.nextInt();
		int n = s2.nextInt();
		
		if(m%n == 0 || n%m==0) {
			System.out.println("false");
			
		}else {
			System.out.println("true");
		}
		
		s1.close();
		s2.close();
		
	}

}

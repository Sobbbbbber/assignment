package assignment06.test1;

import java.util.Scanner;

public class TestValid {
	public static void main(String[] args) {
		System.out.println("please input the length:");
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		int a = s1.nextInt();
		int b = s2.nextInt();
		int c = s3.nextInt();
		
		
		ValidTools vt = new ValidTools(); 
		vt.valid(a, b, c);
		
		s1.close();
		s2.close();
		s3.close();
		
		
	}
}

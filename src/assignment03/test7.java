package assignment03;

import java.util.Scanner;

public class test7 {
	
	public static void main(String[] args) {
		
		System.out.println("Please input the student's score:");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		if(m<=100 && m>=0) {
			if(m >= 85 && m<=100) {
				System.out.println("A");
			}else if(m >= 75) {
				System.out.println("B");
			}else if(m >= 60) {
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}
		else {
			System.out.println("please input the right score!");
		}
		
		scan.close();
		
		
	}

}

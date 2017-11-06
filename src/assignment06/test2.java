package assignment06;

import java.util.Scanner;

public class test2 {
	boolean div(int a) {
		boolean f = true;
		for(int i=2; i <= a/2; i++) {
			if(a%i == 0) {
				f= false;
			}
		}
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println("please input a num:");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.print(a+"=");
		
		test2 t =new test2();
		
		while(a>=1) {
			for(int i =2; i <= a; i++) {
				if(t.div(i)==true && a%i==0) {
					a=a/i;
					if(a==1) {System.out.print(i);}
					else{System.out.print(i+"*");}
					
					break;
				}
			}
		}
		
		s.close();
	}

}

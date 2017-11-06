package assignment07;

//6. 写一个方法，求两个数的最大公约数和最小公倍数。


import java.util.Scanner;

public class test5 {
	int commin(int a, int b) {
	
		int min=a>b?a:b;
		int i = 0;
		for( i = min; i>=1; i--) {
			if(a%i==0  &&b%i==0) {
				System.out.println("最大公约数是："+i);
				break;
			}
		}
		return i;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("请输入两个整数：");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		test5 t = new test5();
		int c=t.commin(a, b);		
		
		int d = a*b/c;
		
		System.out.println("最小公倍数是："+d);
		
		
		
		
		s1.close();
		s2.close();
	}

}

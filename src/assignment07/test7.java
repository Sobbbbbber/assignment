package assignment07;
//7. 写一个方法，求给定的四位整数的各个位数之和。
import java.util.Scanner;

public class test7 {
	
	int getLast(int num) {
		
		return num%10;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("请输入整数：");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		test7 t = new test7();
		int sum = 0;
		while(a>0) {
			
		    sum+=t.getLast(a);
		    a=a/10;
		}
		System.out.println(sum);
		
		
		
		s1.close();
	
	}

}

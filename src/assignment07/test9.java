package assignment07;
//9. 给定一个五位数，判断是否为回文数。12321， 85258， 785587
import java.util.Scanner;

public class test9 {
	
	int getLast(int num) {
		
		return num%10;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("请输入整数：");
		
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		test9 t = new test9();
		
		int total=0;
		int a = n;
		
		while(a>0) {
			
		    total=total*10+t.getLast(a);
		    a=a/10;
		}
		if(total == n) {
			System.out.println("是回文数字");
		}else {System.out.println("不是回文数字");}
		
		
	
		
		
		
		s1.close();
	
	}

}

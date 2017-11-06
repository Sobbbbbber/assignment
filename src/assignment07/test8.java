package assignment07;
//8. 给定一个五位数，然后把它逆序输出。
import java.util.Scanner;

public class test8 {
	
	int getLast(int num) {
		
		return num%10;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("请输入整数：");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		test8 t = new test8();
		
		while(a>0) {
			
		    System.out.print(t.getLast(a));
		    a=a/10;
		}
	
		
		
		
		s1.close();
	
	}

}

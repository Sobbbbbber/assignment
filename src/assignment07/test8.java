package assignment07;
//8. ����һ����λ����Ȼ��������������
import java.util.Scanner;

public class test8 {
	
	int getLast(int num) {
		
		return num%10;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("������������");
		
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

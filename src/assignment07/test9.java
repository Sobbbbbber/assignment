package assignment07;
//9. ����һ����λ�����ж��Ƿ�Ϊ��������12321�� 85258�� 785587
import java.util.Scanner;

public class test9 {
	
	int getLast(int num) {
		
		return num%10;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("������������");
		
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
			System.out.println("�ǻ�������");
		}else {System.out.println("���ǻ�������");}
		
		
	
		
		
		
		s1.close();
	
	}

}

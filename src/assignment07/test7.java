package assignment07;
//7. дһ�����������������λ�����ĸ���λ��֮�͡�
import java.util.Scanner;

public class test7 {
	
	int getLast(int num) {
		
		return num%10;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("������������");
		
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

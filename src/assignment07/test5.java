package assignment07;

//6. дһ���������������������Լ������С��������


import java.util.Scanner;

public class test5 {
	int commin(int a, int b) {
	
		int min=a>b?a:b;
		int i = 0;
		for( i = min; i>=1; i--) {
			if(a%i==0  &&b%i==0) {
				System.out.println("���Լ���ǣ�"+i);
				break;
			}
		}
		return i;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("����������������");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		test5 t = new test5();
		int c=t.commin(a, b);		
		
		int d = a*b/c;
		
		System.out.println("��С�������ǣ�"+d);
		
		
		
		
		s1.close();
		s2.close();
	}

}

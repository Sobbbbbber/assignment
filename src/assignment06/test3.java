package assignment06;
//���1---1000�������ܱ�7����������ÿ����ʾ6����
import java.util.Scanner;

public class test3 {
	void div(int a,int c) {
		int count = 0;
		for(int i = a; i<1000; i++) {
			if(i%a == 0) {
				count ++;
				System.out.print(i+" ");
				if(count%c ==0) {
					System.out.println();
				}
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("please input a num and the line:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();		
		Scanner s2 = new Scanner(System.in);
		int c = s2.nextInt();
		
		test3 t = new test3();
		t.div(a, c);
		
		s1.close();
		s2.close();
		
	}

}

package assignment05;
/*
 * ��1+2+3����+1000�ĺͣ��Ѻ����������ÿ��������ж��ٸ������8��β�ġ�
 * 
 */

public class test3 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		int sum = 0;
		while(i<=1000) {
			sum+=i;
			int a=sum;
			int m = new test3().mod(a);
//			int m =this.mod(a);
			if(m==8) {
				count++;
				System.out.print(sum);
				System.out.print("------");
				System.out.println(i);
			}
			i++;
			
		}
		System.out.println("--------------------------");
		System.out.println(sum);
		System.out.println(count);
		
	}
	
	
	 int mod(int a) {
		while(a>=10) {
			a=a%10;
		}
		return a;
	}

}

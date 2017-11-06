package assignment04;

public class test4 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<100; i++) {
			if(i%6==0 && i%9==0) {
				System.out.println(i);
				sum+=i;
			}		
		}
		
		System.out.println("the sum is:"+sum);
	}
		

}

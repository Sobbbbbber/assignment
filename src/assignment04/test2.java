package assignment04;

public class test2 {
	public static void main(String[] args) {
		boolean f = false;
		int sum = 0;
		for(int i = 1; i<=1000; i++) {
			sum+=i;
			if(sum > 500 && f==false) {
				f = true;
				System.out.println("when add to "+i+" the sum is gt 500,it's:"+sum);
			}
		}
		System.out.println("the sum is:"+sum);
		
	}

}

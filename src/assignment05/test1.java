package assignment05;

public class test1 {
	public static void main(String[] args) {
		int i = 1;
		int count=0;
		int sum = 0;
		while(count<6) {
			System.out.println(i);
			sum+=i;
			i=i*10+1;
			count++;
		}
		System.out.println(sum);
	}

}

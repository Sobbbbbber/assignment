package assignment05;

public class test6 {
	public static void main(String[] args) {
		double i = 6000.0f;
		double sum = 0;
		for(int y = 1; y<=240; y++) {
			System.out.println(i);
			sum+=i;
			i=i*(1+0.005);
		}
		System.out.println("--------------"+sum);
	}

}

package assignment08;

public class test2 {
	 int firbo(int n) {
		//int k 
		if(n==1 || n==2) {
			return 1;
		}else {
			return firbo(n-1)+firbo(n-2);
		}
		
	}
	 
	 public static void main(String[] args) {
		test2 t = new test2();
		int count = 1;
		float sum = 0;
		while(count <= 20) {
			System.out.println(t.firbo(count+2));
			
			sum +=t.firbo(count+2)*1.0/t.firbo(count+1);
			count ++;
		}
		
		System.out.println(sum);
	}

}

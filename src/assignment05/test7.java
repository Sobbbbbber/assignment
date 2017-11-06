package assignment05;

public class test7 {
	public static void main(String[] args) {
		int i = 100;
		int count = 0;
		
		while(i<=200) {
			if(i%5==0 && i%6==0) {
				i++;
				continue;
			}
			
			if(i%5==0 || i%6==0) {
				count++;
				System.out.print(i+" ");
				if(count%10==0) {
					System.out.println();
					
				}
			}
			
			i++;
			
			
		}
		
		
	}

}

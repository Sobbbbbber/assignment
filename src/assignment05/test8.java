package assignment05;

//8. 打印乘法口诀表。


public class test8 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1;j <= i; j++ ) {
				a=i*j;
				System.out.print(i+"*"+j+"="+a+"  ");
				if(j == i) {
					System.out.println();
				}
				
			}
			
		}
	}

}

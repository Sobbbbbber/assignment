package assignment06.test1;

public class ValidTools {
	public boolean valid(int a,int b, int c) {
		int max = 0;
		int min = 0;
		int mid = 0;
		if(a>b) {
			if(a>c) {
				max = a;
				if(c>b) {mid = c; min = b;}
				else {mid = b; min = c;}
			}else {max = c;mid = a; min = b;}
		}else {
			if(b>c) {
				max = b;
				if(c>a) {mid = c; min = a;}
				else {mid = a; min = c;}
			}
			else {max = c;mid = b; min = a;}
			}
		boolean f =max>=(min+mid)?false:true;
		System.out.println(f);
		return f;
	}

}

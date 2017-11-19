package assignment25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
	public static int getInt() {
		
		while(true) {
			try{
				Scanner scan = new Scanner(System.in);
				int result = scan.nextInt();
//				scan.close();
				return result;
			}catch(InputMismatchException e) {
				System.out.println("ÇëÊäÈëÕûÊı");
			}
		}
		
	}

}

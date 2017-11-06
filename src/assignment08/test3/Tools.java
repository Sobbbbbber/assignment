package assignment08.test3;

import java.util.Scanner;

public class Tools {
	int num;
	
	public void inform() {
		System.out.println("提示用户，1为普通话，2 for English :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		switch (num) {
		case 1:System.out.println("您好，欢迎使用本系统");break;

		case 2:System.out.println("Hello, welcome to use this system");
			break;
			
		default:System.out.println("worry input!");
		}
		s.close();
	}

}

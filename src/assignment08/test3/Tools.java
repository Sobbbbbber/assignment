package assignment08.test3;

import java.util.Scanner;

public class Tools {
	int num;
	
	public void inform() {
		System.out.println("��ʾ�û���1Ϊ��ͨ����2 for English :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		switch (num) {
		case 1:System.out.println("���ã���ӭʹ�ñ�ϵͳ");break;

		case 2:System.out.println("Hello, welcome to use this system");
			break;
			
		default:System.out.println("worry input!");
		}
		s.close();
	}

}

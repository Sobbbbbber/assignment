package assignment11;

import java.util.Scanner;

//8. �û�����ѧ�ţ��������shxt_��ͷ�����Һ����4λ���֣�ǰ��λ����06С�ڵ��ڵ�ǰ��ݡ��ж��û������Ƿ�Ϸ���shxt_0801

public class test08 {
	public static void main(String[] args) {
//		String str = "shxt_0801";
//		System.out.println(str.substring(0, 5));
//		System.out.println(str.substring(5,7));
		
		System.out.println("please input the num:");
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		leagal(str);
		s.close();
		
		
	}
	
	
	static void leagal(String s) {
		String s1 = s.substring(0, 5);
		String s2 = s.substring(5,7);
		
		
		boolean  f1 = s1.equals("shxt_");
		boolean  f2 = (s2.compareTo("06") > 0) && (s2.compareTo("17") <= 0);
		
		if(f1 && f2 == true) {
			System.out.println("RIGHT!");
		}else {
			System.out.println("Please input the right num!");
		}
		
	}
}

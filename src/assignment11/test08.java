package assignment11;

import java.util.Scanner;

//8. 用户输入学号，如果是以shxt_开头，并且后边是4位数字，前两位大于06小于等于当前年份。判断用户输入是否合法。shxt_0801

public class test08 {
	public static void main(String[] args) {
 //   	String str = "shxt_0801";
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
		String s3 = s.substring(5);
		
		
		boolean  f1 = s1.equals("shxt_");
	//	boolean  f2 = (s2.compareTo("06") > 0) && (s2.compareTo("17") <= 0);
		boolean  f3 = isNum(s3);
		
		int t = Integer.parseInt(s2);
		
		boolean f2 = t<=17 && t>06;
		
		
		
		
		
		if(f1 && f2 && f3 == true) {
			System.out.println("RIGHT!");
		}else {
			System.out.println("Please input the right num!");
		}
		
	}
	
	static boolean isNum(String str) {
		boolean f;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			f = Character.isDigit(c);
			if(!f) {
				return false;
			}
			
		}
		return true;
	}
}

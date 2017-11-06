package assignment03;

import java.util.Scanner;

public class test8 {
	
	public static void main(String[] args) {
		System.out.println("please input the num between 0 to 23:");
		
		Scanner s1 = new Scanner(System.in);
		int m = s1.nextInt();
		
		switch(m) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("GoodMorning!");	break;	
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11: System.out.println("GoodNoon!");break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17: System.out.println("GoodAfternoon!");break;
		
		default: System.out.println("GoodEvening!");
		
		}
		s1.close();
	}

}

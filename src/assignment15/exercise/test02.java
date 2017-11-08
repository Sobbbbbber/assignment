package assignment15.exercise;

import java.util.ArrayList;

public class test02 {
	ArrayList<Integer> alist = new ArrayList<Integer>();
	
//	public void addAndSort(int element) {
//		int a = 0;
//		for (int i = 0; i < alist.size(); i++) {
//			a = alist.get(i);
//			if(element>a) {
//				alist.set(i, element);
//				for (int j = i+1; j < alist.size(); j++) {
//					alist.set(j, alist.get(j-1));
//				}
//				break;
//			}
//			
//		}
//		
//	}
//	
	public static void main(String[] args) {
		System.out.println("hhhhh");
		ArrayList<Integer> alist = new ArrayList<Integer>();
   
        alist.add(40);
		int a = 0;
		int element = 400;
		for (int i = 0; i < alist.size(); i++) {
			a = alist.get(i);
			if(element>a) {
				
				for (int j = alist.size()-1; j >=i+1; j--) {
					alist.set(j, alist.get(j-1));
				}
				alist.set(i, element);
				break;
			}
			
		}
		
		
		
		
		
		for (int j= 0; j < alist.size(); j++) {
			 System.out.print(alist.get(j)+" ");
	   }		
		
		
	}
	

}

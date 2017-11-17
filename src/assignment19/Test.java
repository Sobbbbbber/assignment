package assignment19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
		LinkedList<HashMap<String, Integer>> list = new LinkedList<HashMap<String, Integer>>();
		int numT = 2;
		int numS = 2;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(numT > 0) {
			
			HashMap<String, Integer> hm = new HashMap<String,Integer>();
//			Scanner s1 = new Scanner(System.in);
//			Scanner s2 = new Scanner(System.in);
			int num = numS;
			while(num > 0) {
			
				System.out.println("Test"+numT+" pleasr input the students' name and score:");
				String n = s1.next();
				int score = s2.nextInt();
				hm.put(n, score);
				num--;
				
			}	
			list.add(hm);
			numT--;
			System.out.println("----------------------");
//			s1.close();s2.close();
		}
		
		
		System.out.println("which test do you want to check:");		
		int id = s2.nextInt();
		
		
//		
//		System.out.println(list.size());
		Iterator<HashMap<String,Integer>> it = list.iterator();
		int count = 1;
		while(it.hasNext()) {
			HashMap<String,Integer> hm = it.next();
			if(count == id) {
				int sum = 0;
				System.out.println(hm.size());
				Collection<Integer> coll  = hm.values();
				Iterator<Integer> itt = coll.iterator();
				System.out.println(coll.size());
				while(itt.hasNext()) {
					int a = itt.next();
					sum+=a;
					System.out.println(a);
				}
				System.out.println("The total score of this test is "+ sum);			
				
			}
			count++;
			
		}
		
		
		
		System.out.println("which Stu do you want to check:");
	
		String name = s1.next();
		Iterator<HashMap<String,Integer>> listit = list.iterator();
		int sum = 0;
		while(listit.hasNext()) {
			HashMap<String,Integer> hm = listit.next();
			
				sum+=hm.get(name);
		}
		System.out.println("The total score of this Stu is "+ sum);	
//		System.out.println("The average score of this Stu is "+ sum);
	}

}

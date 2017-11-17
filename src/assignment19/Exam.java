package assignment19;
//exist error!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;



public class Exam {
	public int nStu=2;
	public int nTest=2;

	LinkedList<HashMap<String, Integer>> list;
	

//	public HashMap<String,Integer> recordOne() {
//		
//		HashMap<String, Integer> hm = new HashMap<String,Integer>();
//
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		int num = this.nStu;
//	
//		while(num > 0) {
//			
//			System.out.println("pleasr input the students' name and score:");
//			String n = s1.next();
//			int score = s2.nextInt();
//			hm.put(n, score);
//			num--;
//			
//		}
//		s1.close();
//		s2.close();
//		return hm;
//	}
	
	
	public LinkedList<HashMap<String, Integer>> recorderAll(){
	
		LinkedList<HashMap<String, Integer>> list = new LinkedList<HashMap<String, Integer>>();
		int numT = this.nTest;
		int numS = this.nStu;
		while(numT > 0) {
			
			HashMap<String, Integer> hm = new HashMap<String,Integer>();
			Scanner s1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
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
			
		}
	
		return list;
		
	}
	
	
	public void checkTest() {
		recorderAll();
		System.out.println("which test do you want to check:");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		
		Iterator<HashMap<String,Integer>> it = list.iterator();
		int count = 1;
		while(it.hasNext()) {
			HashMap<String,Integer> hm = it.next();
			if(count == num) {
				int sum = 0;
				Collection<Integer> coll  = hm.values();
				Iterator<Integer> itt = coll.iterator();
				while(itt.hasNext()) {
					sum+=itt.next();
				}
				System.out.println("The total score of this test is "+ sum);			
				System.out.println("The average score of this test is "+ sum);
				break;
			}
			count++;
			
		}
	}
	
	public void checkStu() {
		System.out.println("which Stu do you want to check:");
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();
		Iterator<HashMap<String,Integer>> it = list.iterator();
		int sum = 0;
		while(it.hasNext()) {
			HashMap<String,Integer> hm = it.next();
			
				sum+=hm.get(name);
		}
		System.out.println("The total score of this Stu is "+ sum);	
		System.out.println("The average score of this Stu is "+ sum);
			
	}
	
	
	public static void main(String[] args) {
		Exam e = new Exam();
//		e.recorderAll();
		e.checkTest();
		e.checkStu();
	}
	


	
	
	
}

package assignment16;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {
	public LinkedList<Integer> getRandom() {
		int a = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 4; i++) {
			a = (int)(Math.random()*10);
			list.add(a);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"  ");
			
		}
		System.out.println();
		
		return list;
	}
	
	
	public void show(LinkedList<Integer> k) {
		
		for (int i = 0; i < k.size(); i++) {
			System.out.print(k.get(i)+"  ");
			
			if(i%4 == 0) {
				System.out.println();
			}
		}
	}
	
    public boolean compare(LinkedList<Integer> list, int a,int b,int c,int d) {
    	int count = 0;
    	
    	
    	
    	if(list.get(0)==a) {
    		count ++;
    	}
    	if(list.get(1)==b) {
    		count++;
    	}
    	if(list.get(2)==c) {
    		count++;
    	}		
    	if(list.get(3)==d) {
      		count++;
    	} 	
    	if(count == 4) {	
    		System.out.println("BINGO!");
            return true;
        }else {
	    	System.out.println("you guess right "+count+"  Fighting!");
	    	return false;
        }
    }	
	
	
	public static void main(String[] args) {
		Game g = new Game();
		LinkedList<Integer> list = g.getRandom();
		LinkedList<Integer> k = new LinkedList<Integer>();
		int a,b,c,d;
		int function;
		int m =0;  //循环十次计数
		boolean sign = false;
		
		while(!sign && m <=10) {
			System.out.println("please choose the function(1--history) and input four numbers:");
			Scanner f = new Scanner(System.in);
			function=f.nextInt();
			
			Scanner s1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			Scanner s3 = new Scanner(System.in);
			Scanner s4 = new Scanner(System.in);
			a=s1.nextInt();
			b=s2.nextInt();
			c=s3.nextInt();
			d=s4.nextInt();
			
			
			switch (function) {
			case 1:
				System.out.println("histroy:");
				g.show(k);
				break;

			default:
				break;
			}
			
			
			sign = g.compare(list, a, b, c, d);
			k.add(a);
			k.add(b);
			k.add(c);
			k.add(d);
			if(sign) {break;}
			m++;
			
		}
		
		
		
		
		
		
	}
	
	

}

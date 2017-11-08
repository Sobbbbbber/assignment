package assignment18;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Game {
	int numOfPrize=0;
	int life=0;
	TreeSet<Prize> ts = new TreeSet<Prize>();
	int userScore=0;
	
	
	
	

	public TreeSet<Prize> setPrize(){
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		while(numOfPrize > 0) {
			
			System.out.println("please input the name and score of Prize:");
			String a = scan1.next();
			int b = scan2.nextInt();
			
			Prize p = new Prize(a,b);
			ts.add(p);
			
			numOfPrize --;
			
		}
		
		return ts;
	}

	
	public void show() {
		Iterator<Prize> it = ts.iterator();
		while(it.hasNext()) {
			Prize p = it.next();
			System.out.println(p.name+"  "+p.score);
		}
		
	}
	
	
	
	public int random() {
		int a = 0;
		a = (int)(Math.random()*10) +1;
		return a;
		
	}

	public void guess() {
		Iterator<Prize> it = ts.iterator();
		
		
		System.out.println("please input the num: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		life--;
		boolean f = false;
		
		
		while(it.hasNext()) {
			Prize p = it.next();
			int rand  = random();
			System.out.println("---------------------"+rand);
			if(a == rand) {
				System.out.println("猜对了！");
				userScore+=p.score;
				it.remove();
				numOfPrize--;
				f = true;
				break;
			}
		}	
		if(f) {
			
		}else {
			System.out.println("很遗憾，猜错了！");
		}
		
		
	}
	
	public void restart() {
		ts.clear();
		System.out.println("please input the numOfPrizeand the life: ");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);		
		int a = scan1.nextInt();
		int b = scan2.nextInt();
		setLife(b);
		setNumOfPrize(a);
		setPrize();
	}


	public void setNumOfPrize(int numOfPrize) {
		this.numOfPrize = numOfPrize;
	}


	public void setLife(int life) {
		this.life = life;
	}

	
	public void start() {
		restart();
		System.out.println(random());
		boolean tag = true;
		while(life>0 && tag) {
			System.out.println("please choose one:1.begin  2.show   3.guess  4.reset  5.exit");
			Scanner scan = new Scanner(System.in);		
			int a = scan.nextInt();	
			switch (a) {
			case 1:restart();
				
				break;
			case 2:show();
					
				break;
			case 3:guess();
						
				break;
			case 4:restart();
							
				break;
			case 5:
				tag = false;			
				break;
	
			default:
				break;
			}
		}
		
		if(userScore > 100) {System.out.println("WIN!!!!!!!!");}
		else {System.out.println("SAD~~~~~~~");}
	}

	public static void main(String[] args) {
		Game g = new Game();
		g.start();
	
	}

}

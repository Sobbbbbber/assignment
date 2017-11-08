package assignment15.exercise;

import java.util.ArrayList;

public class test03 {
	public static void main(String[] args) {
		Point p1 =new Point();
		Point p2 =new Point();
		Point p3 =new Point();
		
		p1.x = 8;
		p2.x = 2;
		p3.x = 3;
		
		p1.y = 4;
		p2.y = 1;
		p2.y = 3;
		
		ArrayList<Point> list = new ArrayList<Point>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Point temp = new Point();
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size()-1-i; j++) {
				if(list.get(j).x >list.get(j+1).x) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).x+"  ");
		}
		
	}
	
}


class Point{
	public int x;
	public int y;
	public int distance;

	
}
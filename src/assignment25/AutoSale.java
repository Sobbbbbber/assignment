package assignment25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class AutoSale {
	 public JDBC j;
	 public int money;
	
	 AutoSale(){
		 j = new JDBC();
	 }
	 
	 void start() {
		 boolean f = true;
		 Scanner scan = new Scanner(System.in);
		 while(f) {
	 		 System.out.println("1.投币并显示清单       2.选择购买       3.显示清单       4 找零      5 退出");
	 		 int number = scan.nextInt();
			 switch (number) {
				case 1:putMoney();  display(); break;
				case 2:buy(); break;
				case 3:display();  break;
				case 4:check();  break;
				case 5:f=false;  break;

			}
		 			 
		 }
		

		 
	 }
	 
	 
	 void putMoney() {
		 System.out.println("please input the money");
		 Scanner scan = new Scanner(System.in);
		 money = scan.nextInt();
		
		 
	 }
	 
	 
	 void display() {
			String sql = "select * from autosale";
			ArrayList<HashMap<String,String>> list = j.query(sql);
			
			
			System.out.println("id  name  num  price");
			for(int i = 0; i < list.size(); i++) {
				HashMap<String, String > map = list.get(i);
				System.out.print(map.get("id")+"  ");
				System.out.print(map.get("name")+"  ");
				System.out.print(map.get("num")+"  ");
				System.out.println(map.get("price")+"  ");

			}
		 
		 
	 }
	 
	 
	 void buy() {
		 System.out.println("please input the id");
		 Scanner scan1 = new Scanner(System.in);
		 int id = scan1.nextInt();
	
		 System.out.println(id);
		 String sql = "select * from autosale where id = "+id;
		 ArrayList<HashMap<String, String>> list1 = j.query(sql);
//		 System.out.println(list.size());
		 String num = list1.get(0).get("num");
		 String price = list1.get(0).get("price");
		 int n = Integer.parseInt(num);
		 int p = Integer.parseInt(price);
		 int k = money-p;
		 if(n>0) {
			 if(k>=0) {
				 String sql1 = "update autosale set num = "+(n-1)+" where id = "+id;
				 j.update(sql1);
				 money = k;
			 }else {System.out.println("余额不足！！！");}
			 
		 }else {System.out.println("库存不足！！！");}
		  System.out.println("The rest of money is"+money);

 
	 }
	 
	 
	 void check() {
		  System.out.println("The rest of money is"+money);
	 }
	 
	 void exit() {
		 j.close();
	 }

}

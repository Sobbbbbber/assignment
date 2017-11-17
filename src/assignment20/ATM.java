package assignment20;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		M m = new M();
		m.init();
		m.item();
	}

}

class M{
	int pos = -1;
	ArrayList<User> userList = new ArrayList<User>();
	void init() {
		User user1 = new User();
		user1.account = 10000;
		user1.id = 1001;
		user1.password = 1001;
		user1.name =  "lily";	
		
		User user2 = new User();
		user2.account = 30000;
		user2.id = 1002;
		user2.password = 1002;
		user2.name =  "linda";
		
		userList.add(user1);
		userList.add(user2);
	}
	
	
	void get() {
		User user = userList.get(pos);
		System.out.println("Get How much:");
		int m = Util.getInt();
		if(user.account - m > 0) {
			user.account = user.account - m;
			System.out.println("Success!");
		}else {
			System.out.println("Óà¶î²»×ã");
		}
		query();
		
	}
	
	
	void save() {
		User user = userList.get(pos);
		System.out.println("Save How much:");
		int m = Util.getInt();
	
			user.account = user.account + m;
			System.out.println("Success!");
		
	    query();
	}
	
	
	void query() {
		System.out.println(userList.get(pos).account);
	}
	
	void item(){
		boolean tag = login();
		while(tag) {
			System.out.println("1--get   2--save    3--query");
			int item = Util.getInt();
			switch (item) {
			case 1:get();break;	
			case 2:save();break;	
			case 3:query();break;	
			case 4:tag = false;break;
			
			}
		}
	
	}
	
	boolean login() {
		

		System.out.println("input the id");
		int id =  Util.getInt();		
		System.out.println("input the password");
		int password = Util.getInt();
		
		
		for (int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			if(user.id== id && user.password==password) {
				pos = i;
				return true;
			}
			
		}return false;
		
	}
}

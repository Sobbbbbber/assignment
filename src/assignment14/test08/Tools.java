package assignment14.test08;

public class Tools {
	public boolean isAdmin(String str) {
		if(str.toLowerCase().equals("admin")) {
			return true;
		}
		return false;
	}

}

package assignment14;

public class test01 {
	public static void main(String[] args) {
		String[] arr = {"welcome", "china", "hi", "congratulation","great"};
		int max = 0;
		int sign = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();
				sign = i;
			}
		}
		System.out.println(arr[sign]);
	}

}

package assignment11;

//9. 有一个数组，存了10个学生的英文名字，现要求将这些名字按字典排序（A-Z的序列）。

public class test09 {
	public static void main(String[] args) {
		String[] str = {"zzz","xxx","yyy","aaa","bbb","yyy","ggg","fff"};
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"  ");

		}
		System.out.println();
		sort(str);
	}
	
	
	static void sort(String[] str) {
		String temp = "";
		for (int j = str.length-1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if(str[i].compareTo(str[i+1]) > 0) {
					temp = str[i];
					str[i] = str[i+1];
					str[i+1] = temp;
				}
		    }
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"  ");
		}
		
	}
	

}

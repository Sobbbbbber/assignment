package assignment11;

//10. 有一个数组存储一个班级所有学生的姓名，其中有一个叫张三的学生退学，要求删除该学生。（数组后边的元素前移）

public class test10 {
	public static void main(String[] args) {
		String[] str = {"zzz","xxx","yyy","张三","aaa","bbb","yyy","ggg","fff"};
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"  ");
		}
		System.out.println();
		
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("张三")) {
				
				for (int j = i; j < str.length-1; j++) {
					str[j] = str[j+1];
				}
				
			}
		}
		for (int i = 0; i < str.length-1; i++) {
			System.out.print(str[i]+"  ");
		}
	}

}

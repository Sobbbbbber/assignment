package assignment11;

//5. 一个班级的学生成绩存在长度为10的数组里，计算不及格的有几个。

public class test05 {
	public static void main(String[] args) {
		char[] c = {60,50,78,90,60,98,87,86,30,100};
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i] < 60) { 
				count++;
			}
		}
		System.out.println(count);
	}

	

}

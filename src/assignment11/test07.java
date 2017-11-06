package assignment11;

//7. 数组里有10条记录，分别是10个学生的期末语文成绩，要求把所有低于60分的记录改成不及格（使用字符串数组存储成绩）。

public class test07 {
	public static void main(String[] args) {
		String[] c = {"60","50","78","90","60","98","87","86","30","50"};
	

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].compareTo("60")+"  "+i+"  ");
			if(c[i].compareTo("60") < 0) { 
				c[i] = "不及格";
			}
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"  ");
		}
		
	}

	

}

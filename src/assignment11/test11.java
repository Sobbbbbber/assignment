package assignment11;

/*
 * 11. 如下字符串，01#张三#20-02#李四#30-03#王五#40。。。。。。，解析每个人学号、姓名和分数多少。样式如下：
01 张三 20
02 李四 30
03 王五 40。并且计算总分。

 */


public class test11 {
	public static void main(String[] args) {
		String str ="01#张三#20-02#李四#30-03#王五#40";
		String[] s1 = str.split("-");
		String[][] s2 = new String[3][];
		for (int i = 0; i < s2.length; i++) {
			//for (int j = 0; j < s2[i].length; j++) {	
				s2[i]=s1[i].split("#");
			//}
			
		}
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2[i].length; j++) {
				System.out.print(s2[i][j]+"  "); 
				
			}
			System.out.println();
		}

	}
	

}

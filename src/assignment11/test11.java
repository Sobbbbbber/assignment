package assignment11;

/*
 * 11. �����ַ�����01#����#20-02#����#30-03#����#40������������������ÿ����ѧ�š������ͷ������١���ʽ���£�
01 ���� 20
02 ���� 30
03 ���� 40�����Ҽ����ܷ֡�

 */


public class test11 {
	public static void main(String[] args) {
		String str ="01#����#20-02#����#30-03#����#40";
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

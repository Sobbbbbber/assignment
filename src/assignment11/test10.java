package assignment11;

//10. ��һ������洢һ���༶����ѧ����������������һ����������ѧ����ѧ��Ҫ��ɾ����ѧ�����������ߵ�Ԫ��ǰ�ƣ�

public class test10 {
	public static void main(String[] args) {
		String[] str = {"zzz","xxx","yyy","����","aaa","bbb","yyy","ggg","fff"};
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"  ");
		}
		System.out.println();
		
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("����")) {
				
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

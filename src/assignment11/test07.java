package assignment11;

//7. ��������10����¼���ֱ���10��ѧ������ĩ���ĳɼ���Ҫ������е���60�ֵļ�¼�ĳɲ�����ʹ���ַ�������洢�ɼ�����

public class test07 {
	public static void main(String[] args) {
		String[] c = {"60","50","78","90","60","98","87","86","30","50"};
	

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].compareTo("60")+"  "+i+"  ");
			if(c[i].compareTo("60") < 0) { 
				c[i] = "������";
			}
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"  ");
		}
		
	}

	

}

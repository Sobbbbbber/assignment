package assignment11;

/*
 * 3. дһ���������ж�һ�����֤�ŵ��Ա����֤�ĵ�����2λΪż��ʱ��ʾŮ�������֤��15λ��18λ��
 */

//���֤�ſ�����x ������string

public class test03 {
	public static void main(String[] args) {
		String str = "150196610270132";
		judge(str);
		
	}
	
	static void judge(String str) {
		char[] c = new char[1];
		if (str.length() == 15) {
			str.getChars(13, 14, c, 0);
		}else {
			str.getChars(16, 17, c, 0);
		}
		
		if(c[0]%2 == 0) {
			System.out.println("Female");
		}else {System.out.println("Male");}
		
	}

}

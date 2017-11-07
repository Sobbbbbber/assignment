package assignment11;

/*
 * 3. 写一个方法，判断一个身份证号的性别，身份证的倒数第2位为偶数时表示女。（身份证分15位和18位）
 */
<<<<<<< HEAD

//����֤�ſ�����x ������string

=======
//使用charAt即可
>>>>>>> 071583a9f3f536be7cff649850f02f849e454a11
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

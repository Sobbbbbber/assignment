package assignment11;

/*4. �����¸�ʽ���ַ���name-age-sex-address���������������������Ϣ��
 */

public class test04 {
	public static void main(String[] args) {
		String str = "name-age-sex-address";
		
		String[] s = str.split("-");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
	}

}

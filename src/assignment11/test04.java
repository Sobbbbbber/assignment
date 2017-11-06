package assignment11;

/*4. 有如下格式的字符串name-age-sex-address，解析出姓名，年龄等信息。
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

package assignment11;
/*
 * 2. ��������ѧ���μ�ѧУ�˶���
   shxt_0712	shxt_0704	shxt_0715	shxt_0504	shxt_0602	shxt_0711 shxt_0607��
        ͳ������7����shxt_07��ͷ��������7���ж����˲μӱ�����
*/
public class test02 {
	public static void main(String[] args) {
		String str = "shxt_0712 shxt_0704 shxt_0715 shxt_0504 shxt_0602 shxt_0711 shxt_0607";
		String[] s1 = str.split(" ");
		String s2 = null;
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			s2 = s1[i].substring(0, 7);
			System.out.println(s2);
			if(s2.equals("shxt_07") == true) {
				count ++;
			}
		}
		System.out.println(count);
	}

}

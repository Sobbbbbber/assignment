package assignment11;

//6. ��һ�����飬������������ݰ������ٴ洢��ԭ���顣


public class test06 {
	public static void main(String[] args) {
		int[] a = {2,1,5,3,9,8,7,4,5,6,3,9,4,6};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		turn(a);
	}
	
	static void turn(int[] data) {
		int temp = 0;
		for (int i = 0; i < data.length/2; i++) {
			temp = data[i];
			data[i] = data[data.length-1-i];
			data[data.length-1-i] = temp;
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+"  ");
		}
	}

}



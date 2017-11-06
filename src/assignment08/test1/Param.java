package assignment08.test1;
/*
 1. 写一个类Param，声明四个成员变量a、b、c、d，分别赋予四种访问权限。
（1）试验在同一个包中的另一个类里能访问哪几个变量？ ------3
（2）试验在不同包中的另一个类里能访问哪几个变量？  ----1
（3）试验在不同包中、用Param派生一个子类，看子类能访问哪几个变量？  ----2
*/
public class Param {
	public int a;
	protected int b;
	int c;
	private int d;
	
	void f() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

package TestMax;
//*下面的例子演示了如何定义一个方法，以及如何调用它：
public class Test01 {
	public static void main(String[]args){
		int i=5;
		int j=2;
		int k= max(i,j);
		System.out.println(i+"和"+j+"比較,最大値是:"+k);
	}
	//**返回两个整数变量较大的值*/
	public static int max(int num1, int num2) {
		int result ;
		if (num1>num2)
		result=num1;
		else
		result =num2;
		return result ;
		//这个程序包含了main方法和max方法。main方法是被
		//JVM调用的，除此之外，main方法和其他方法没什么区别
		//main方法的头部是不变的，如例子所示，带修饰符public
		//和static,返回void类型值，方法名字是main此外带个一个
		//String[]类型参数，String[]表明参数是字符串数组。
	}
}


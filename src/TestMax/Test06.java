package TestMax;

public class Test06 {
	public static void main(String[]args){
		int []array1=new int []{1,2,3};
		int sum1=0;
		for(int i=0;i<array1.length;i++){
			sum1=sum1+array1[i];
		}
		System.out.println(sum1);


		int[]array2= new int[]{4,5,6};
		int sum2=0;
		for(int i=0;i<array2.length;i++){
			sum2=sum2+array2[i];
		}
		System.out.println(sum2);
		//なぜ関数を定義する（汎用化の説明）
	}
}

package TestMax;

public class Test0606 {
//	public static void main(String[]args) {
//
//	}
//	//修飾子 返却値の型 関数名 ( 引数１の型 引数１, 引数２の型 引数2 ) {
//	//... 処理内容
//
   public static void main(String[]args){
	   
	   int [] left=new int[]{1,2,3,4};
	   int [] right=new int []{5,6,7,8};
	   	System.out.println();
   }
   public static int[]a(int[]left,int[]right){

	   int[]result = new int[left.length + right.length];
	   for (int i = 0; i < result.length; i++) {

           if (i < left.length) {
               left[i] = left[i];
           } else {
               result[i] = right[i - left.length];
           }
       }



	return result;

   }
}


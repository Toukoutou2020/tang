package TestMax;

public class Test0604 {
		public static void fillArray(String[]array){
			array[0]="valus2";
		}
		public static void main(String[]args){
			String[]array=new String[]{"value1"};
			fillArray(array);
			System.out.println(array[0]);
		}
}

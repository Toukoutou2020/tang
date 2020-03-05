package TestMax;

public class Test0605 {
	private static void fillArray(String[] array) {
		array = new String[] { "1", "2" };
	}

	public static void main(String arags[]) {
		String[] array = null;
		fillArray(array);
		System.out.println(array == null);
	}
}


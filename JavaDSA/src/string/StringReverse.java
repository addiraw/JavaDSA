package string;

public class StringReverse {
	String str = "";

	public static String reverseString(String str) {
		int lengthOfstr = str.length();
		char[] chars = str.toCharArray();
		for (var a : chars) {
		}
		String com = "";
		char[] chars1 = new char[lengthOfstr];
		for (int i = lengthOfstr - 1, j = 0; i >= 0 && j < lengthOfstr; i--, j++) {
			chars1[j] = chars[i];
			com = com + chars1[j];
		}
		return com;
	}

	public static void main(String args[]) {
		String str = "Hello";
		String str1;
		str1 = reverseString(str);
		System.out.println(str1);

	}

}

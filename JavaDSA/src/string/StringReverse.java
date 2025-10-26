package string;

public class StringReverse {

	class Inner {
		public boolean isPal(String param) {
			char[] paraChar = param.toCharArray();
			for (int i = 0; i < paraChar.length; i++) {
				if (paraChar[i] != paraChar[paraChar.length - i - 1]) {
					return false;
				}
			}
			return true;
		}
	}
}
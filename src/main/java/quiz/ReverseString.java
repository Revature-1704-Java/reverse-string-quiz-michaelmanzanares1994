package quiz;

public class ReverseString {
    public String reverse(String input) {
    	String str= "";
		for (int i = input.length()-1; i >= 0; i--) {
			str += input.charAt(i);
		}
        return new StringBuffer(str).reverse().toString();
    }
}

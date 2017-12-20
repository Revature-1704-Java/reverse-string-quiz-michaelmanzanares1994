package quiz;

public class ReverseString {
	public String reverse(String input) {
		StringBuilder build = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			build.append(input.charAt(i));	// build the string in reverse
		}
		return build.toString();
	}
}

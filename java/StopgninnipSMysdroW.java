import java.util.ArrayList;

/**
 * StopgninnipSMysdroW
 * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
 */
public class StopgninnipSMysdroW {
	public String spinWords(String sentence) {
		ArrayList<String> spin = new ArrayList<>();
		for (String word : sentence.split(" ")) {
			if (word.length() >= 5) {
				String tmp = new String();
				for (int i = word.length() - 1; i >= 0; --i) {
					System.out.print(word.charAt(i));
					tmp += word.charAt(i);
				}
				spin.add(tmp);
				tmp = "";
			} else {
				spin.add(word);
			}
		}

		return String.join(" ", spin);
	}

	public static void main(String[] args) {
		StopgninnipSMysdroW s = new StopgninnipSMysdroW();
		String sentence = "Hey fellow warriors";
		String o = s.spinWords(sentence);
		System.out.println(o);
	}
}

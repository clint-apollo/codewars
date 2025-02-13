import java.util.HashMap;
import java.util.Map;

/**
 * InnerCountingDuplicates
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 */
public class CountingDuplicates {
	public static int duplicateCount(String text) {
		HashMap<Character, Integer> count = new HashMap<>();
		int sum = 0;

		for (int i = 0; i < text.length(); ++i) {
			char letter = text.toLowerCase().charAt(i);
			if (!count.containsKey(letter)) {
				count.put(letter, 1);
			} else {
				count.computeIfPresent(letter, (k, v) -> v + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			if (entry.getValue() > 1) {
				sum += 1;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int o = CountingDuplicates
				.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix");
		System.out.println(o);
	}
}

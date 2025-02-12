import java.util.stream.IntStream;

/**
 * MultiplesOf3Or5
 * https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
 */
public class MultiplesOf3Or5 {
	public int solution(int number) {
		return IntStream
				.rangeClosed(1, number - 1)
				.filter(i -> i % 5 == 0 || i % 3 == 0)
				.map(i -> i)
				.sum();
	}

	public static void main(String[] args) {
		MultiplesOf3Or5 m = new MultiplesOf3Or5();
		System.out.println(m.solution(10));
	}
}

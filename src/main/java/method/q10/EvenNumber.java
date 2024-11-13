package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {

		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int count = 0;
		for (int num : array) {
			if (num % 2 == 0) {
				count++;
			}
		}
		System.out.println(Arrays.toString(array) + "には、偶数が" + count + "個あります。");
	}
}
package method.q09;

public class Even {

	public static void main(String[] args) {

		int number = 10;
		if (checkEven(number)) {
			System.out.println(number + "は偶数です。");
		} else {
			System.out.println(number + "は奇数です。");
		}
	}

	public static boolean checkEven(int x) {
		return x % 2 == 0;
	}

}
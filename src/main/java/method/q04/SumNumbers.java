package method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		int number1 = subtract(3);
		int number2 = subtract2(2);
		int calculateSum = subtract3(3, 2);
		System.out.println("第一引数：" + number1);
		System.out.println("第二引数：" + number2);
		System.out.println("加算結果：" + calculateSum);
	}

	public static int subtract(int a) {
		return a;
	}

	public static int subtract2(int b) {
		return b;
	}

	public static int subtract3(int a, int b) {
		return a + b;
	}

}

package method.q07;

public class SumNumbers2 {

	public static double calculateSum(int number1, double number2) {
		double sum = number1 + number2;
		System.out.println("第一引数（整数）：" + number1);
		System.out.println("第二引数（実数）：" + number2);
		return sum;
	}

	public static void main(String[] args) {
		double calculateSum = calculateSum(5, 3.3);
		System.out.println("加算結果：" + (int) calculateSum);
	}

}

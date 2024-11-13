package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int min, max;
		min = 1;
		max = 100;
		System.out.println("最小値:" + min);
		System.out.println("最大値:" + max);
		int sum = loop(min, max);
		System.out.println("加算結果:" + sum);
	}

	public static int loop(int min, int max) {
		int res = 0;
		for (int i = min; i <= max; i++) {
			res += i;
		}
		return res;
	}

}

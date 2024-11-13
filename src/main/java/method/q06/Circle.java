package method.q06;

public class Circle {
	public static double getCircleArea(double radius) {
		double area = radius * radius * 3.14;
		System.out.println("半径：" + radius);
		return area;
	}

	public static void main(String[] args) {
		double getCircleArea = getCircleArea(5.0);
		System.out.println("円の面積:" + getCircleArea);
	}

}
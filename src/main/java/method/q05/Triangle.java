package method.q05;

public class Triangle {

	public static int getTriangleArea(int bottom, int height) {
		int area = (bottom * height) / 2;
		System.out.println("底辺：" + bottom);
		System.out.println("高さ：" + height);
		return area;
	}

	public static void main(String[] args) {
		int getTriangleArea = getTriangleArea(8, 5);
		System.out.println("三角形の面積：" + getTriangleArea);
	}

}

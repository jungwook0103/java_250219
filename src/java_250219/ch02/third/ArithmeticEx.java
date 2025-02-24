package java_250219.ch02.third;

public class ArithmeticEx {
	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		System.out.printf("%d + %d = %d입니다.\n", a, b, a + b);
		
		plus(a, b);
		
		Arithmetic arithmetic = new Arithmetic(a, b);
		
	}
	
	static void plus(int a, int b) {
		System.out.printf("%d + %d = %d입니다.\n", a, b, a + b);
	}

}

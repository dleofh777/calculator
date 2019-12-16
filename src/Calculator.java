import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 입력 값 :");
		int first = sc.nextInt();
		System.out.println("첫번째 수 : " + first);
		
		System.out.println("두 번째 입력 값 :");
		int second = sc.nextInt();
		System.out.println("두번째 수 : " + second);
		
		System.out.println("덧셈:" + (first + second));
		System.out.println("뺄셈:" + (first - second));
		System.out.println("곱셈:" + (first * second));
		System.out.println("나눗셈:" + (first / second));
	}
}

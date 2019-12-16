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
		
		System.out.println("기호 :");
		String symbol = sc.next();
		System.out.println(symbol);
		
		if("+".equals(symbol)) {
			System.out.println("덧셈:" + (first + second));
		}else if("-".equals(symbol)) {
			System.out.println("뺄셈:" + (first - second));
		}else if("*".equals(symbol)) {
			System.out.println("곱셈:" + (first * second));	
		}else if("/".equals(symbol)){
			System.out.println("나눗셈:" + (first / second));
		}else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력하였습니다.");
		}
				
	}
}

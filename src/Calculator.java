import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 입력 값 :");
//		int first = sc.nextInt();
//		System.out.println("첫번째 수 : " + first);
//		
//		System.out.println("두 번째 입력 값 :");
//		int second = sc.nextInt();
//		System.out.println("두번째 수 : " + second);
//		
//		System.out.println("기호 :");
//		String symbol = sc.next();
//		System.out.println(symbol);
//		
//		if("+".equals(symbol)) {
//			System.out.println("덧셈:" + (first + second));
//		}else if("-".equals(symbol)) {
//			System.out.println("뺄셈:" + (first - second));
//		}else if("*".equals(symbol)) {
//			System.out.println("곱셈:" + (first * second));	
//		}else if("/".equals(symbol)){
//			System.out.println("나눗셈:" + (first / second));
//		}else {
//			System.out.println("사칙연산에 해당하지 않는 값을 입력하였습니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("첫번째 입력값  : ");
		int a = sc.nextInt();
		System.out.println(a);
		
		int b = 0;
		while(true) {
			System.out.println("기호 : ");
			String symbol = sc.next();
			System.out.println(symbol);
						
			if(symbol.equals("quit")){
				break;
			}
			
			System.out.println(i+1+"번째 입력값 : ");
			b = sc.nextInt();
			System.out.println(b);
			
			if(symbol.equals("+")) {
				a = a + b;
				i++;
			}else if(symbol.equals("-")) {
				a = a - b;
				i++;
			}else if(symbol.equals("*")) {
				a = a * b;
				i++;
			}else if(symbol.equals("/")) {
				a = a / b;
				i++;
			}else {
				System.out.println("잘못된 기호 입니다.");
				System.out.println("올바른 기호를 다시 입력해주세요.");
			}			
		}
		System.out.println("사칙 연산 결과 : " + a);
				
	}
}

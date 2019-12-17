import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner sc) {	
		System.out.println("첫번째 입력값  : ");
		int first = sc.nextInt();
		System.out.println(first);
		return first;
	}
	
	static String getSymbol(Scanner sc) {
		System.out.println("기호 : ");
		String symbol = sc.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int getSecondValue(Scanner sc) {
		System.out.println("두 번째 입력값 : ");
		int second = sc.nextInt();
		System.out.println(second);
		return second;
	}
	
	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if(symbol.equals("+")) {
			result = first + second;
			System.out.println("덧셈 : " + result);
		}else if(symbol.equals("-")) {
			result = first - second;
			System.out.println("뺄셈 : " + result);
		}else if(symbol.equals("*")) {
			result = first * second;
			System.out.println("곱셈 : " + result);
		}else if(symbol.equals("/")) {
			result = first / second;
			System.out.println("나눗셈 : " + result);
		}else {
			System.out.println("잘못된 기호 입니다.");
			System.out.println("올바른 기호를 다시 입력해주세요.");
		}	
		return result;
	}
	
	static void print(int result) {
		System.out.println("최종 결과 값 :" + result);
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int first = getFirstValue(sc);
		
		int result = first;
		while(true) {
			String symbol = getSymbol(sc);
			
			if(symbol.equals("quit")){
				print(result);
				break;
			}
			
			int second = getSecondValue(sc);
			
			result = calculate(first, symbol, second);			
		}				
	}
}

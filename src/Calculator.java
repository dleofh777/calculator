import java.util.Scanner;

public class Calculator {	
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
			
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int first = Input.getFirstValue(sc);
		
		int result = first;
		while(true) {
			String symbol = Input.getSymbol(sc);
			
			if(symbol.equals("quit")){
				Output.print(result);
				break;
			}
			
			int second = Input.getSecondValue(sc);
			
			result = calculate(result, symbol, second);			
		}	
		
		sc.close();
	}
}

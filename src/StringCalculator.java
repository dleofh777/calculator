import java.util.Scanner;

public class StringCalculator {
		
//		static int calculate(int first, String symbol, int second) {
//			int result = 0;
//			if(symbol.equals("+")) {
//				result = first + second;
//				System.out.println("덧셈 : " + result);
//			}else if(symbol.equals("-")) {
//				result = first - second;
//				System.out.println("뺄셈 : " + result);
//			}else if(symbol.equals("*")) {
//				result = first * second;
//				System.out.println("곱셈 : " + result);
//			}else if(symbol.equals("/")) {
//				result = first / second;
//				System.out.println("나눗셈 : " + result);
//			}else {
//				System.out.println("잘못된 기호 입니다.");
//				System.out.println("올바른 기호를 다시 입력해주세요.");
//			}	
//			return result;
//		}
				
		public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
			System.out.println("계산할 값 입력 : ");
			
			String value = sc.nextLine();
			System.out.println("입력 값 : " + value);
			String[] values = value.split(" ");		
			
			int first = Integer.parseInt(values[0]);
			
			int result = first;
			
			for(int i =1; i < values.length; i= i +2) {

				String symbol = values[i];			
				int second = Integer.parseInt(values[i+1]);
				result = Calculator.calculate(result, symbol, second);	
				
			}	
			Output.print(result);
			sc.close();
		}
	
}

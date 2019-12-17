import java.util.Scanner;

public class Input {
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
}

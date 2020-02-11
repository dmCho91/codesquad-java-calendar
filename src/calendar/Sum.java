package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
//		String inputValue = scan.nextLine();
//		String[] splitedValue = inputValue.split(" ");
//		
//		int val1 = Integer.parseInt(splitedValue[0]);
//		int val2 = Integer.parseInt(splitedValue[1]);
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		int val1 = Integer.parseInt(s1);
		int val2 = Integer.parseInt(s2);
		
		//출력: 화면에 두 수의 합을 출력한다.
//		System.out.println("두 수의 합은 " + (val1+val2) + "입니다.");
		System.out.printf("두 수의 합은 %d입니다.", val1+val2);
		
		scan.close();
		
		
	}
}

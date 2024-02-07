package if_;

import java.util.Scanner;

public class quiz01 {
public static void main(String[] args) {
	Scanner inputScanner =new Scanner(System.in);
	System.out.print("두수를 입력 받아 큰수를 출력하시오");
	int num1_1 =inputScanner.nextInt();
	int num1_2 =inputScanner.nextInt();
	if(num1_1>num1_2) System.out.println(num1_1+"이 더 큰수입니다.");
	if(num1_2>num1_1) System.out.println(num1_2+"이 더 큰수입니다.");
	
	
	System.out.print("세수를 입력 받아 큰수를 출력하시오");
	int num2_1 =inputScanner.nextInt();
	int num2_2 =inputScanner.nextInt();
	int num2_3 =inputScanner.nextInt();
	if(num2_1>num2_2&&num2_1>num2_3) System.out.println(num2_1+"이 더 큰수입니다.");
	if(num2_2>num2_1&&num2_2>num2_3) System.out.println(num2_2+"이 더 큰수입니다.");
	if(num2_3>num2_1&&num2_3>num2_2) System.out.println(num2_3+"이 더 큰수입니다.");
	
	

}
}

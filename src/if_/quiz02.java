package if_;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력:");
		int num = input.nextInt();
		//1. 3의 배수이면서, 4의 배수에도 해당합니다.
		if(num%3==0&&num%4==0&&num!=0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		}else if(num%3==0&&num!=0) {
			//2. 3의 배수에만 해당합니다.
			System.out.println("3의 배수에만 해당합니다.");
		}else if(num%4==0&&num!=0) {
			//3. 4의 배수에만 해당합니다.
			System.out.println("4의 배수에만 해당합니다.");
		}else if(num==0) {
			//5.0은 잘못입력했습니다.
			System.out.println("0은 잘못입력했습니다.");
			
		}else {
			//4.3의 배수도 4의 배수도 해당안됩니다.
			System.out.println("3의 배수도 4의 배수도 해당안됩니다.");
		}	
	}
}

//조별 문제 생성

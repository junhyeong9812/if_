package if_;

import java.util.Scanner;

public class group7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//문제 1번 : 달러 환전 프로그램을 작성하세요
		//1.환전하실 단위 선택지를 먼저 작성하세요(원하는 단위를 선택하지 않으면 다시 선택하게끔 해주세요)
		//2. 환율은 1달러 1326원입니다
		//3.소수점 없이 정수만 사용하세요
		//출력화면
		//환전하실 단위를 선택하세요(1-달러, 2-원화)
		//5
		//잘못 입력하셨습니다 다시 입력해주세요
		//환전하실 단위를 선택하세요(1-달러, 2-원화)
		//6
		//잘못 입력하셨습니다 다시 입력해주세요
		//환전하실 단위를 선택하세요(1-달러, 2-원화)
		//2
		//얼마를 환전 하시겠습니까? 
		//30000
		//30000원을 환전하시면 22달러입니다
		System.out.println("환전하실 단위를 선택하세요(1-달러, 2-원화)");
		int select=input.nextInt();
		if(select==1) {
			System.out.println("얼마를 환전 하시겠습니까? ");
			int money=input.nextInt();
			System.out.println(money*1326);
			System.out.println(money+"달러를 환전하시면 "+money*1326+"원입니다.");
		}
		else if (select==2) {
			System.out.println("얼마를 환전 하시겠습니까? ");
			int money=input.nextInt();
			System.out.println(money/1326);
			System.out.println(money+"원을 환전하시면 "+money/1326+"달러입니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
		}
		

		//문제 2번 : 나이를 입력하여 다음 결과 값을 출력하는 프로그램을 작성하세요.
		//10대(미성년자 입니다.) 몇 살뒤에는 어른이 됩니다.
		//20~90대 어른 입니다. 각 메시지표기/ 100살 이상 존재하지 않습니다.
		System.out.println("나이를 입력해주세요 :");
		int age=input.nextInt();
		if (age>0||age<100) {
			if(age>=10&&age<20) {
				System.out.println("10대 : 미성년자입니다."+(20-age)+"");
			}
			
		}else {
			System.out.println("나이입력이 잘못됬습니다. 0세부터 100세까지만 가능합니다.");
		}
		
		
		//문제 3번 : 
		// 1. 각각의 문자열 2진수를 정수로 형변환하여 num1...4 변수에 대입하시오.[integer...]
		// 2. 형변환한 2진수를 출력하시오.
		// 2. 정수형 변수 result1과 result2를 만드시오
		// 3. result1에 num1과 num2를 &(AND) 연산자로 계산하여 대입하시오.
		// 4. result1에 num3과 num4를 |(or)  연산자로 계산하여 대입하시오.
		// 5. if문을 사용하여 result1과 result2의 크기를 비교하여 큰 수, 작은 수로 출력하시오.

	
	}
}

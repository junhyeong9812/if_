package if_;

import java.util.Scanner;

public class group5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
//		1. 문제
//		 나이와 금액을입력 받고 영화표를 구매할 수 있는지 
//		알수 있는 프로그램을 만드시오
//		영화는 13000원이며 10세~15세 어린이표가 있고
//		15000원이며 모두시청가능 ~19세 성인표가 있다.
//		System.out.print("나이를 입력해주세요.");
//		int age = input.nextInt();
//		System.out.print("금액을 입력해주세요 :");
//		int money = input.nextInt();
//		int child= 13000;
//		int adult= 15000;
//		if(age>=10&&age<=15) {
//			if(money-child>=0) {
//				System.out.println("영화표를 구매할 수 있습니다.");
//			}else {
//				System.out.println("영화표를 구매할 수 없습니다.");
//			}
//		}else if(age>15) {
//			if(money-adult>=0) {
//				System.out.println("영화표를 구매할 수 있습니다.");
//			}else {
//				System.out.println("영화표를 구매할 수 없습니다.");
//			}
//			
//		}
		
//		2.문제
//		600kg을 담을 수 있는 컨테이너에 물건을 모두 실으려고 한다. 
//		A가 세 물건을 실을 때, 세 물건의 무게를 입력 받고
//		세 물건의 무게 총합과 남은 무게, "가장 무거운 무게는 ~kg입니다"를 출력하시오
//		600kg 초과될 경우 "무게가 600kg를 초과하였습니다. ~kg을 제외하시오" 메세지를 출력하시오
//
//		출력 예시 ) 
//		무게를 입력하시오 : 
//		54 78 65
//
//		세 물건의 무게 총합은 197kg 입니다.
//		남은 무게는 403kg 입니다.
//		가장 무거운 무게는 78입니다.

		double max=600;
		System.out.print("첫번째 물건의 무게를 입력해주세요(kg단위):");
		double weight1=input.nextDouble();
		System.out.print("두번째 물건의 무게를 입력해주세요(kg단위):");
		double weight2=input.nextDouble();
		System.out.print("세번째 물건의 무게를 입력해주세요(kg단위):");
		double weight3=input.nextDouble();
		double sum = weight1+weight2+weight3;
		double x;
		if(weight1>weight2&&weight1>weight3) {
			x=weight1;
		}else if(weight2>weight1&&weight2>weight3) {
			x=weight2;
		}else{
			x=weight3;
		}
		//
		
		if(sum<=600) {
			System.out.println("세 물건의 무게 총합은 "+sum+"kg입니다.");
			System.out.println("남은 무게는 "+(max-sum)+"kg입니다.");
			System.out.println("가장 무거운 무게는 "+x+"kg입니다.");
		}
//		3. 문제
//
//		국어, 영어, 수학 점수를 입력 받아 평균을 구한 후,
//		평군이 60점 이상이면서 과목 점수가 모두 60점 이상이면 [합격]
//		평균이 60점 이상이지만 과목 점수가 한과목 이상 60점 미만이면 [과락으로 불합격]
//		평균이 60점 미만이면 [평균 미달 불합격]
		
//		System.out.print("국어를 입력해주세요.");
//		int kor = input.nextInt();
//		System.out.print("영어를 입력해주세요.");
//		int eng = input.nextInt();
//		System.out.print("수학를 입력해주세요.");
//		int math = input.nextInt();
//		int avg =(kor+eng+math)/3;
//		if(avg>=60&&avg<=100&&kor>=60&&eng>=60&&math>=60)System.out.println("합격");
//		else if(avg>=60&&avg<=100)System.out.println("과락으로 불합격");
//		else System.out.println("평균 미달 불합격");
//		



	}

}

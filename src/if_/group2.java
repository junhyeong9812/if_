package if_;

import java.util.Scanner;

public class group2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		문제 1. 
//		1과목, 2과목, 3과목, 4과목, 5과목 까지 있는 시험을 치른다.
//		한 과목이라도 60점 미만인 경우 "불합격입니다."를 출력하고
//		총점이 400점 이상이면 "합격입니다!"를 출력하시오.
		
//		System.out.print("1과목");
//		int sub1 = input.nextInt();
//		System.out.print("2과목");
//		int sub2 = input.nextInt();
//		System.out.print("3과목");
//		int sub3 = input.nextInt();
//		System.out.print("4과목");
//		int sub4 = input.nextInt();
//		System.out.print("5과목");
//		int sub5 = input.nextInt();
//		
//		if(sub1>60&&sub2>60&&sub3>60&&sub4>60&&sub5>60&&(sub1+sub2+sub3+sub4+sub5)>=400) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
		

//문제 2.
//점수와 학년을 입력했을때 합격 불합격 여부
//
//조건 -1) 점수가 60점 이상면 합격 그렇지 않으면 불합격 출력
//        2)  단, 4학년을 입력했을때는 70점 이상이여야 합격이다
		
//		System.out.print("학년을 입력해주세요:");
//		int grade = input.nextInt();
//		System.out.print("점수를 입력해주세요 :");
//		int score = input.nextInt();
//		if(grade<=4&&score<=100&&score>0) {
//		if(grade<4&&score>=60||grade==4&&score>=70) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
//		}
//		문제 3.
//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
//		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//
//		입력)
//
//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//
//		출력)
//
//		첫째 줄에 윤년이면 1, 아니면 0을 출력한다
		
//		System.out.print("년도을 입력해주세요:");
//		int years = input.nextInt();
//		if(years>0&&years<=4000) {
//			if(years%4==0&&years%100!=0||years%4==0&&years%400==0) {
//				System.out.println("1");
//			}else {
//				System.out.println("0");
//			}
//		} else {
//			System.out.println("1~4000사이를 입력하세요");
//		}
//		
		System.out.println("현재 년도를 입력하세요 :");
		int years = input.nextInt();
		
		System.out.println("만 나이를 입력하세요 :");
		int age = input.nextInt();
		System.out.println((years-age)+"년대에 태어났습니다.");
		
		
		
	}
}

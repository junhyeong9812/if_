package if_;

import java.util.Scanner;

public class group4 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
//	문제1.
//	1에서부터 6까지의 눈을 가진 주사위를 두명이서 굴려서 승자를 정하는 게임
//	두명이 본인의 [이름]과 [주사위 수]를 입력 
//	출력 ex) [이름]님 승리
//	    	 [이름]님 승리
//	    	 무승부 
//	    	 1~6 사이의 숫자만 입력해주세요
//	System.out.print("이름을 입력해주세요 :");
//	String name1 = input.next();
//	System.out.print("주사위 수을 입력해주세요 :");
//	int num1 = input.nextInt();
//	System.out.print("이름을 입력해주세요 :");
//	String name2 = input.next();
//	System.out.print("주사위 수을 입력해주세요 :");
//	int num2 = input.nextInt();
//	if(num1>0&&num1<=6&&num2>0&&num2<=6) {
//	if(num1>num2) {
//		System.out.println(name1+" 승리");
//	}else if(num2>num1) {
//		System.out.println(name2+" 승리");
//	}else{
//		System.out.println("무승부");
//		}	
//	}
	
	
	

//	문제2. 
//	국어, 영어, 수학 점수를 입력하여 평균 점수와 등급을 출력하는 프로그램을 작성하시오.
//	단,  평균이 100점 초과이거나, 0점 미만인 경우 "잘못입력하셨습니다."를 출력하도록 작성하시오.
//	(A:90점 이상, B:90점 미만 80점 이상, C:80점 미만 70점 이상, D:70점 미만 60점 이상, F:60점 미만)
//	출력 ex ) 
//	국어, 영어, 수학 점수를 입력하세요 > 
//	95 90 85
//	평균 점수는 90점이며, 등급은 A입니다.
//	System.out.print("국어,영어,수학 점수를 입력하세요:");
//	int kor=input.nextInt();
//	int eng=input.nextInt();
//	int math=input.nextInt();
//	int avg = (kor+eng+math)/3;
//	if(avg>0&&avg<=100) {
//	if (avg>=90)System.out.println("평균 점수는 "+avg+"점이며, 등급은 A입니다.");
//	else if (avg>=80)System.out.println("평균 점수는 "+avg+"점이며, 등급은 B입니다.");
//	else if (avg>=70)System.out.println("평균 점수는 "+avg+"점이며, 등급은 C입니다.");
//	else if (avg>=60)System.out.println("평균 점수는 "+avg+"점이며, 등급은 D입니다.");
//	else System.out.println("평균 점수는 "+avg+"점이며, 등급은 F입니다.");
//	}
	
	
//	문제3.
//	두 명이 가위, 바위, 보를 입력하여 결과를 출력하는 프로그램을 작성하시오.
//	단, 가위, 바위, 보가 아닌 것을 입력하면 "잘못입력하셨습니다." 출력
//	출력 ex )
//	첫번째 사람 가위 바위 보 입력 :
//	가위
//	두번째 사람 가위 바위 보 입력 :
//	바위
//	두번째 사람 승
	System.out.print("이름:");
	String name1=input.next();
	System.out.print("가위,바위,보 중 1택");
	String rsp1=input.next();
	System.out.print("이름:");
	String name2=input.next();
	System.out.print("가위,바위,보 중 1택");
	String rsp2=input.next();
//	if(rsp1.equals("가위")&&rsp2.equals("가위")||rsp1.equals("가위")&&rsp2.equals("바위")||rsp1.equals("가위")&&rsp2.equals("보")||
//	   rsp1.equals("바위")&&rsp2.equals("가위")||rsp1.equals("바위")&&rsp2.equals("바위")||rsp1.equals("바위")&&rsp2.equals("보")||
//	   rsp1.equals("보")&&rsp2.equals("가위")||rsp1.equals("보")&&rsp2.equals("바위")||rsp1.equals("보")&&rsp2.equals("보")) {
	if(rsp1.equals("가위")||rsp1.equals("보")||rsp1.equals("바위")) {
	if(rsp2.equals("가위")||rsp2.equals("보")||rsp2.equals("바위"))	 {
	if(rsp1.equals(rsp2))System.out.println("무승부입니다.");
	else if(rsp1.equals("가위")&&rsp2.equals("보"))System.out.println(name1+" 승리하였습니다.");
	else if(rsp1.equals("가위")&&rsp2.equals("바위"))System.out.println(name2+" 승리하였습니다.");
	else if(rsp1.equals("바위")&&rsp2.equals("가위"))System.out.println(name1+" 승리하였습니다.");
	else if(rsp1.equals("바위")&&rsp2.equals("보"))System.out.println(name2+" 승리하였습니다.");
	else if(rsp1.equals("보")&&rsp2.equals("바위"))System.out.println(name1+" 승리하였습니다.");
	else if(rsp1.equals("보")&&rsp2.equals("가위"))System.out.println(name2+" 승리하였습니다.");
	}else System.out.println(name2+"이 잘못입력하셨습니다.");
	}else System.out.println(name1+"이 잘못입력하셨습니다.");
}
}

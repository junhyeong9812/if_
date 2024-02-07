package if_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class group6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		문제1.  
//
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//
//		1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//		2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//		3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//
//		입력: 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
//		출력: 첫째 줄에 게임의 상금을 출력 한다.
//
//		예제 입력1:  3 3 6	 예제 출력1: 1300
//		예제 입력2:  2 2 2  예제 출력2: 12000  
//		예제 입력3:  6 2 5  예제 출력2:   600
//		System.out.print("3개의 주사위 결과를 입력해주세요:");
//		int dice1 = input.nextInt();
//		int dice2 = input.nextInt();
//		int dice3 = input.nextInt();
//		int max=0;
//	
//		if(dice1==dice2&&dice1==dice3)System.out.println(10000+(dice1)*1000);
//		else if(dice1==dice2)System.out.println(1000+(dice1)*100);	
//		else if(dice1==dice3)System.out.println(1000+(dice1)*100); 
//		else if(dice2==dice3)System.out.println(1000+(dice2)*100); 
//		else if(dice1>dice2&&dice1>dice3)System.out.println(dice1*100);	
//		else if(dice2>dice1&&dice2>dice3)System.out.println(dice2*100);
//		else System.out.println(dice3*100);
////		if(dice3>dice2&&dice3>dice1)
//			
//			
			

//		문제2.
//
//		메뉴판을 출력 후 금액을 입력 받은 뒤 메뉴를 선택하면 거스름돈과 주문한 메뉴가 출력된다.
//		 ------- 메뉴판 -------
//		 1. 햄버거(9,000원)
//		 2. 피자(11,000원)
//		 3. 치킨(32,000원)
//		 4. 금액 반환
//		 -----------------------
//		 ※ 만약 금액을 입력했을 때 가장 저렴한 금액의 메뉴보다 적은 금액이 입력되었다면, "주문할 수 있는 메뉴 없음 xxxx원 반환" 을 출력
//		 ※ 투입 금액보다 비싼 음식을 선택하는 경우 "투입 금액이 부족합니다. xxxx원 반환" 을 출력
//		 ※ 메뉴판에 없는 메뉴 선택 시 "올바른 주문이 아닙니다. xxxx원 반환" 을 출력
//		 ※ 메뉴를 선택할때 4번을 선택 시 "투입 금액 xxxx원 반환" 을 출력
//
//		 ※ 주문 시 ( 1. 포장, 2. 매장식사 ) 선택지를 출력하여 선택하게한 뒤 최종 메세지는 아래와 같이 출력한다
//		 ( 1, 2 외에 다른 숫자 선택 시 "선택 오류 xxxx원 반환" 을 출력 )
//		 -----------------------
//		 주문 메뉴 : xxxx
//		 포장 or 매장식사
//		 거스름돈 : xxxx원
//		 -----------------------
//		System.out.println("------- 메뉴판 -------");
//		System.out.println("1. 햄버거(9,000원)");
//		System.out.println("2. 피자(11,000원)");
//		System.out.println("3. 치킨(32,000원)");
//		System.out.println("4. 금액 반환");
//		System.out.println("---------------------");
//		System.out.print("금액을 입력해주세요.");
//		int money=input.nextInt();
//		int cheese=0 ,mleft=0;
//		if(money<9000) {
//			System.out.println("주문할 수 있는 메뉴 없음 "+money+"원 반환");
//		}else {
//			System.out.println("메뉴를 선택해주세요:");
//			int select1=input.nextInt();
//			if (select1==1) {
//				if(money>=9000) {
//					mleft=money-9000;
//					cheese+=1;
//					
//				}else {
//					System.out.println("투입 금액이 부족합니다. "+money+"원 반환");
//				}
//			}
//			else if (select1==2) {
//				if(money>=11000) {
//					mleft=money-11000;
//					cheese+=1;
//				}else {
//					System.out.println("투입 금액이 부족합니다. "+money+"원 반환");
//				}
//				
//			}
//			else if (select1==3) {
//				if(money>=32000) {
//					mleft=money-32000;
//					cheese+=1;
//				}else {
//					System.out.println("투입 금액이 부족합니다. "+money+"원 반환");
//				}
//				
//			}
//			else if (select1==4) {	
//				System.out.println("투입 금액 "+money+"원 반환");
//			}else {
//				System.out.println("올바른 주문이 아닙니다. "+money+"원 반환");
//			}
//			if(cheese==1) {
//			System.out.print("1. 포장, 2. 매장식사 :");
//				int select2=input.nextInt();
//				if(select2==1) {
//					if(select1==1) {
//					System.out.println("주문 메뉴 : 햄버거");
//					}
//					else if(select1==2) {
//						System.out.println("주문 메뉴 : 피자");
//						}
//					else if(select1==3) {
//						System.out.println("주문 메뉴 : 치킨");
//						}
//					System.out.println("포장");
//					System.out.println("거스름돈 :"+mleft);
//					
//				}else if(select2==2) {
//					if(select1==1) {
//						System.out.println("주문 메뉴 : 햄버거");
//						}
//						else if(select1==2) {
//							System.out.println("주문 메뉴 : 피자");
//							}
//						else if(select1==3) {
//							System.out.println("주문 메뉴 : 치킨");
//							}
//						System.out.println("매장식사");
//						System.out.println("거스름돈 :"+mleft);
//						
//				}else {
//					System.out.println("선택 오류 "+money+"원 반환");
//				}
//			}
//			
//			
//		}
		
//		문제 3.
//
//		짱구는 약속 시간에 맨날 늦는다.
//		그래서 약속 시간 보다 25분 빨리 알람을 맞출 것이다.
//		* 약속 시간을 입력하면, 약속 시간 25분 전의 시간을 출력해주는 프로그램을 만드세요
//
//		[조건]
//		1. 00시 00분의 형식으로 시간을 입력한다.
//		2. 시각(hour) 은 00시~23시 사이에만 존재하며,
//		    분(minute) 은 00분~59분 사이에만 존재한다.
//		 (이외의 시간이 입력되면 "시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요"라고 출력한다)
//		3. 알람 출력 형태는 "XX시 XX분에 알람을 맞추겠습니다"이다.
//		 (단, 00시 00분~00시 24분 사이의 시간을 입력하면
//		   "전날 23시 XX분에 알람을 맞추겠습니다" 라고 출력한다)
		System.out.print("약속 시간을 입력해주세요 :");
		String promise=input.nextLine();
		String[] pro=promise.split("시");
		String[] pro1=pro[1].split("분");
		pro1[0]=pro1[0].trim();
		
		System.out.println(Arrays.toString(pro));
		System.out.println(Arrays.toString(pro1));
		
//		System.out.println(Arrays.toString(pro[0]));
		int hour=Integer.parseInt(pro[0]);
		int min=Integer.parseInt(pro1[0]);
		System.out.println(hour);
		System.out.println(min);
		if(hour>=0&&hour<24&&min>=0&&min<60) {
			if(hour==0&&min<25) {
				min=60+(min-25);
				hour=23;
				System.out.println("전날 "+hour+"시 "+min+"분에 알람을 맞추겠습니다");
			}else {
				if(min-25<0) {
					hour=hour-1;
					min=60+(min-25);
					System.out.println(hour+"시 "+min+"분에 알람을 맞추겠습니다");
				}else {
					min-=25;
					System.out.println(hour+"시 "+min+"분에 알람을 맞추겠습니다");
				}
			}
		}else {
			System.out.println("시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요");
		}
		
		
		
		
	}

}

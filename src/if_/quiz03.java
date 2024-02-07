package if_;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.print("문자열을 입력하세요 :");
	String base = input.nextLine();
	System.out.print("찾을 단어를 입력하세요:");
	String hei=input.next();
	//System.out.print("찾으시려면 1을 입력해주세요.");
	//int a=input.nextInt();
	
	//if(a==1) {
		if(base.contains(hei)) {
			System.out.println("단어가 있습니다.");
		}else {
		System.out.println("단어가 없습니다.");
		}
	//}else {
	//	System.out.println("하지마이개새끼야");
	//}
	}
}

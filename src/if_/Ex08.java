package if_;

import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int num;
	System.out.println("수 입력:");
	num= input.nextInt();
//	if(num>100) {
//		//사용자가 150을 넣게 되면 위 값만 사용하고 아래는 진행하지 않는다.
//		System.out.println("100보다 큰 수");
//	}
//	else if(num>50){
//		//100보다 작은 수를 입력하면 첫 IF문이 실행안되고 else if를 확인 후
//		//있으면 그 if만 동작하고 꺼지거나 다름 else if도 아니라면
//		//else까지 가서 확인 후 동작을 나가게 된다.
//		System.out.println("50보다 큰 수");
//	}
//	else if(num>0){
//		System.out.println("0보다 큰 수");
//	}
//	else {
//		System.out.println("그 외의 값");
//	}
//	System.out.println("다음 문장들 실행");
	if(num>100) {
	//사용자가 150을 넣게 되면 위 값만 사용하고 아래는 진행하지 않는다.
	System.out.println("100보다 큰 수");
}
 if(num>50){
	//100보다 작은 수를 입력하면 첫 IF문이 실행안되고 else if를 확인 후
	//있으면 그 if만 동작하고 꺼지거나 다름 else if도 아니라면
	//else까지 가서 확인 후 동작을 나가게 된다.
	System.out.println("50보다 큰 수");
}
 if(num>0){
	System.out.println("0보다 큰 수");
}
else {
	System.out.println("그 외의 값");
}
System.out.println("다음 문장들 실행");
}
//만약 else가 없이 그냥 if만 사용한다면 모든 if문이 동작되기 떄문에
//모든 if문이 동작하게 된다. 그렇기 때문에 else if로 묶고 하면 조건에 맞는
//if문만 실행되기 때문에 else if가 좋다

}

package if_;

public class Ex06 {
public static void main(String[] args) {
//	중첩if는 줄을 나눠놓은 것
	int n1=10,n2=20,n3=30;
	if(n1>n2 && n1>n3) {
		System.out.println("n1이 가장크다.");
	}
	//가장 큰 수, 두번째 큰수, 마지막 수 출력
	//만약 위같은 조건일 시 위의 방식은 사용할 수 없다.
	//각각 분류하기 위해서는
	
	
	//n1이 가장 큰 경우
	if(n1>n2) {
		if(n1>n3) {
			if(n2>n3) {
				System.out.println("n1가 가장 큰 수");
				System.out.println("n2가 중간 수");
				System.out.println("n3가 가장 작은 수");
			}else {
				System.out.println("n1가 가장 큰 수");
				System.out.println("n3가 중간 수");
				System.out.println("n2가 가장 작은 수");
			}
		}
//		else {
//			System.out.println("n3가 가장 큰 수");
//			System.out.println("n1가 중간 수");
//			System.out.println("n2가 가장 작은 수");			
//		}
	}
	
	//n2가 가장 큰 경우
	if(n2>n1) {
		if(n2>n3) {
			if(n1>n3) {
				System.out.println("n2가 가장 큰 수");
				System.out.println("n1가 중간 수");
				System.out.println("n3가 가장 작은 수");
			}else {
				System.out.println("n2가 가장 큰 수");
				System.out.println("n3가 중간 수");
				System.out.println("n1가 가장 작은 수");
			}
		}
//		else {
//			System.out.println("n3가 가장 큰 수");
//			System.out.println("n2가 중간 수");
//			System.out.println("n1가 가장 작은 수");			
//		}	
	}
	
	//n3가 가장 큰 경우
	if(n3>n1) {
		if(n3>n2) {
			if(n1>n3) {
				System.out.println("n3가 가장 큰 수");
				System.out.println("n1가 중간 큰 수");
				System.out.println("n3가 가장 작은 수");
			}else {
				System.out.println("n3가 가장 큰 수");
				System.out.println("n2가 중간 큰 수");
				System.out.println("n1가 가장 작은 수");
			}
		}
//		else {
//			System.out.println("n2가 가장 큰 수");
//			System.out.println("n3가 중간 큰 수");
//			System.out.println("n1가 가장 작은 수");			
//		}
	}
	
	ｉｆ（
}
}

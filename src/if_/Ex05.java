package if_;

public class Ex05 {
	public static void main(String[] args) {
		int num,su =10;
		//int num=0,su =10;
		if(su>100) {
			num=1234;
		}
		if(su <=100) {
			num=1;
		}
		//System.out.println(num);
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The local variable num may not have been initialized
//			현재 num이 지역변수이기 때문에 
//		The local variable num may not have been initialized
//		>>num이라는 값이 초기화가 되지 않았따는 것을 알 수 있다.
	//			현재 위같이 오류가 나오는 것은 if문이 실행이 안될 수도 있기
		//		떄문에 num자체 초기화가 if문같은 문법 외부에서 동작해야된다.
		else {
			num=1;
		}
//		단 else로 num값을 초기화를 해주면 굳이 초기화를 하지 않더라도
//		else내부에 초기화가 되기 때문에 오류가 나오지 않는다.
//		else는 if를 제외한 모든 경우에서 초기화가 진행되기 때문에
//		num이 초기화가 안된다는 선택지가 없어서 오류가 안나오게 된다.
		System.out.println(num);	

	}
}

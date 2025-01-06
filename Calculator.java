package method;

public class Calculator {
	//생성자만 필수 멤버필드,메서드,내부클래스는 필수요소가 아님
	//덧셈기능 add
	
	int Add (int a, int b) {
		int sum = a+b;
		return sum;
	}
	double multi(double n1, int n2) {
		return n1*n2;
	}
	//문자열 + 정수,실수 등등은 전부 문자열임
}

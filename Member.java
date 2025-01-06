package cclass;

public class Member {
	//멤버 필드
	long MemberNo;//회원번호
	String email;//인증을 위한 정보
	String phone;//핸드폰
	String name;
	
	void display() {
		//메서드 기능같은것을 정의
		//반환형 함수이름(매개변수)의 형태임
		//정의하는 유형따라 4가지 분류(리턴타입 과 매개변수 유무에 따라) 
		//void 메서드 이름() : 매개변수가 없을때 ()표기
		//void 매서드 이름(매개변수 존재): 대표적으로 setter메서드
		//리턴타입 매서드이름() //매개변수가 없을때
		//리턴타입 매서드이름(매개변수 존재) 이렇게 총 4개의 형태임
	}
	public Member() {
		// 디폴트 생성자(클래스를 만드는순간 결정되고 만들어짐)
	}
	
	class InnerClass{
		//내부 클래스(클래스 내부에 오는 새로운 클래스)
		//당연히 멤버필드 메서드 내부클래스 또 만들수있음
	}
	
	
	
	
}

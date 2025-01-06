package method;

public class Person {
	
	//멤버 필드
	String name;
	int birth;
	String email;
	double height;
	
	//getter메서드
	//리턴타입 존재 메서드 이름(){}
	String getName() {
		return name;//getName을 호출하면 return을 되돌려줘라 this 생략된형태임 즉void일땐 return은 쓸수있어도 reutrn 뒤에 value를 표시못함
	} //value가 붙으면 그 value에 데이터타입보다 크거나 최소 같은 애가 void자리에 붙어야함
	  //return ; 이런식으로 value 없이 사용하면 메서드의 종료를 의미합니다. 값이있다면 값을 반환하고 종료합니다 호출위치에
	int getBirth() { //놀랍게도 이건 인트가 아닌 인티저네 그게 아니라 소문자로 써야되네;;
		return birth;
	}
	double getHeight() {
		return height;
	}
	String getEmail() {
		return email;
	}
	void setName(String name) {//멤버필드랑 매개변수랑 이름똑같이하면 그거둘다 사용이가능함 영역이 겹치기때문에
	//컴파일러는 애매모호 할수있는 상황 , 가장 가까이 정의된 변수를 취함
	this.name = name; //그렇기에 구별을 해줘야함 this로 this = 이클래스
	//name필드를 수정하는 메서드
	}
	void setBirth(int birth) {
		this.birth = birth;
	}
	void setEmail(String email) {
		this.email = email;
	}
	void setHeight(double height) {
		this.height = height;
	}
	
	
	void display() {
		//이건 메서드 멤버변수도없고 리턴값도 없음
		//지역변수 선언가능
		//명령어들 사용가능(실행문장)
		System.out.println("생년월일 : " + this.birth); //얘는 접근가능한 변수가 하나밖에없으므로 this생략가능
		System.out.println("이름 : " + this.name);
		System.out.println("이메일 : " + this.email);
		System.out.println("키 : " + this.height);
	}
	

}

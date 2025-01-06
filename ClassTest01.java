package cclass;

public class ClassTest01 {

	public static void main(String[] args) {
		//배열이 동일데이터만의 집합이라고한다면 클래스는
		//동일 데이터 뿐만 아니라 다른 타입도 집합처리 가능
		Exam ex1 = new Exam(); //실제 이안에는 인트 더블 스트링이 포함되어있음 // 마찬가지로 heap에 할당 그러므로 디폴트 초기화값 있음 new를 통해 인스턴스화 후 생성자 호출
		
		//뒤에 Exam()이 바로 생성자 이작업이 바로 객체를 만드는과정 저위에 문장이 되야 객체의 완성임 Exam.java는 만드려고 계획만 해놓은상태
		//Exam ex1 변수화 = new 인스턴스화 Exam()생성자만들기(초기화)
		Exam[] exs = new Exam[20]; //이런식으로 배열도 가능
		
		Point[] point = new Point[20]; //point는 지역변수임=>스택메모리에 할당
		//point도 마찬가지로 주소를 담음(래퍼런스 변수)
		Point point1 = new Point(); //인스터화:클래스로부터 객체를 만드는 과정 더정확히는 heap에 필요한 메모리할당 작업
		point1.a = 10;
		point1.b = 20;
		System.out.println("Class Point에 할당되어있는 a의 값: "+ point1.a); //이런식으로 .(멤버접근 연산자)를 통해서만 접근가능
		System.out.println("Class Point에 할당되어있는 b의 값: " +point1.b);
	}

}

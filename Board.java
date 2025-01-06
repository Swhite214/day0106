package cclass;

import java.time.LocalDateTime;

//cclass.Board
//클래스의 정의(처음 만드는행위 definition): 웹개발 -> 게시글 사용하기위해
//추상화: 게시글을 만들때 ip주소도 필요하고.. 쓰는이도 필요하고 등등 이런거 도출해내는 작업들
public class Board {
	String title;
	String content;
	String writer;
	int readCount;
	LocalDateTime createdDate;//이건 자바 내부에 기본으로 제공하는거임 8버전 이상만 유틸에 스캐너와 비슷
	//보통 heap에 할당되는 애들은 디폴트값존재 int 등은 0 String이나 LocalDateTime 이런애들은 NUll 생성자가 알아서 담당해줌
	//기본생성자 보통 그냥 생략함
	boolean sign;
	//멤버의 정보를 출력하는 메서드
	//리턴형타입(비어있으면 보이드)즉 리턴값이랑 void이부분의 데이터타입이 매칭되어야함 매서드이름() {}
	//어떤 클래스의 기능: 여기서는 출력기능
	void asdy() {
		//title 보면 Board안에서 선언했기때문에 여기서도 별도의 객체생성없이 접근가능함
		//내부의 클래스에 있는 것에 접근할땐 this this란 현재객체를 의미함 물론 생략 가능...
		System.out.println("제목: "+ title); //이런식으로
		System.out.println("조회수: "+ this.readCount);
		System.out.println("작성일: "+ this.createdDate);
		System.out.println("로그인 여부: "+ this.sign); //boolean의 기본타입 = false
		System.out.println("내용: "+ this.content);
		System.out.println("작성자: "+ this.writer );
		System.out.println("----------");
	}
	public Board() {
		// TODO Auto-generated constructor stub
	}
}


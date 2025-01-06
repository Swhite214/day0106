package cclass;

import java.time.LocalDateTime;

public class BoardTest01 {
	public static void main(String[] args) {
	Board board1 = new Board();
	//메서드 사용: 메서드 호출 ==> 메서드{}블록의 내용이 실행됩니다.
	board1.asdy(); //매서드 호출 매서드 내부를 실행하라
	
	board1.title = "제목 테스트";
	board1.content = "내용입니다.";
	board1.writer = "박찬우";
	board1.readCount += 1;
	board1.createdDate = LocalDateTime.now(); //특이한 방식
	board1.sign = true;
	
	board1.asdy();
	System.out.println("---수정----");
	board1.asdy();; //boolean의 기본타입 = false
	;

	
	}
}

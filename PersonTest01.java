package method;

public class PersonTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 만들어서 접근권한을 받아오자
		Person person = new Person();
		person.display();
		System.out.println(); //줄바꾸기 요긴하게 쓰이는 코드
		System.out.println("-------");
		person.setName("박찬우"); //이런식으로 하는이유는 만약 Person 클래스에서 멤버변수 앞에 private를 써버리면 person.name="박찬우" 이런식이안됨
		person.display();
		person.setBirth(19991121);
		person.setEmail("sileok@gmail.com");
		person.setHeight(175.3);
		person.display();
		System.out.println("-------");
		String name =person.getName(); //return값을 받아옵니다 받아온다고 바로 출력되는거아닙니다
		System.out.println(person.getName()); //바로 출력하려면 이렇게 하세요
		System.out.println(name);
		int birth = person.getBirth();
		System.out.println(birth);
		double height = person.getHeight();
		System.out.println(height);
		String email = person.getEmail();
		System.out.println(email);
	}

}

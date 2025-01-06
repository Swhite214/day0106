package method;

public class CalculatorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator(); //우선 객체를 만들자
			int sum =cal.Add(5, 3); //역시 바로 실행되는건아님
			System.out.println("5+3=" +sum);
			System.out.println("12+34=" + cal.Add(12,34)); //이런식으로도 만들수있어요
			
			int x=1290;
			int y= -4403;
			
			int sum1 = cal.Add(x, y);
			System.out.println(x+"+"+y+"="+sum1);
			
	}

}

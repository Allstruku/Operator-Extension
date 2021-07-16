package constructorExam;

// 클래스를 만들고 클래스를 이용해서 객체 (instance)를 만들려면 new이라는 연산자를 사용
// new 다음에는 반드시 생성자가 나와야한다
class ConstructorExam {
	int age;
	// 윗 int age; 는 class block에서 field를 생성한 것이다
	public ConstructorExam (int number) {
		age = number;
	}
	// 위 코드는 생성자를 선언할 때에 쓰이는 코드. (public 클래스명 (매개변수 목록) {...} - 생성자 블록
	// 메소드과는 다르게 리턴타입이 없다. 또한 프로그래머가 직접 생성자를 만들지 않으면 매개변수가 없는 생성자를 컴파일러가 자동으로 만든다
	// 매개변수가 없는 생성자를 기본 생성자라고 한다
	// 생성자를 프로그래머가 직접 하나라도 만들었다면 컴파일러가 기본 생성자를 자동으로 안 만든다
	public static void main(String[] args) {
//		ConstructorExam consEx = new ConstructorExam();
		// 원래 배운것이 윗 코드. new 연산자를 사용했다는 것은 다음 나올것이 생성자라는 표시
		// 클래스에서 상성자를 선언 안했으면 기본 생성자가 만들어진다
		ConstructorExam consEx = new ConstructorExam(20);
		// 하지만 매개변수가 있는 생성자를 선언했기 때문에 new 연산자 다음에 나오는 ConstructorExam() 괄호 사이에 매개변수를 넣어야함
		// 이렇게 생성자가 하는 일은 객체가 될때 필드를 초기화하는 (대입) 역할
		// 20이 받은 매개변수이기에 number에 대입이 된다. 그 다음에는 number가 age 필드에 대입이된다
		System.out.println(consEx.age);
	}
}

class Sp{
	// 인스턴스 변수 name
	String name = "Fred";

}

class Test extends Sp{
	String name = "Lucy";
	public static void main(String[] args){
		Sp ss = new Sp();
		System.out.println(/*"Sp타입 변수ss의 Sp타입의 인스턴스의 name 변수값"*/ss.name);

		Sp s = new Test();
		System.out.println(/*"Sp타입 변수 s의 Test타입의 인스턴스의 name 변수값"*/s.name);

		Test t = new Test();
		System.out.println(/*"Test타입의 변수 Test타입의 인스턴스의 name 변수값"*/t.name);

				/*결과값은 Fred Fred Lucy 이다. 필드값은 타입을 따라간다. */


		t = (Test)s;
		System.out.println(s.name);
		// 결과값은 Fred 이다. s는 Sp타입형태의 Test인스턴스값을 가지고 있었다.
		// s의 name값은 Fred 였고 Test형태의 변수 t에 다운 캐스트를 하여 대입
		// s의 본래 name 값 Fred가 대입되어 출력된다.
	}
}
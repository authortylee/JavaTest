class Sp{
	static void foo(){
		System.out.print("A");
	}
}

class Sub extends Sp{
}

class Test{
	public static void main(String[] args){
		Sub s1 = new Sub();
			s1.foo();
			// Sub 타입의 변수 s1은 Sp클래스의 서브타입 클래스의 인스턴스이다.
			// Sub 타입은 foo()를 가지고 있지 않다. JVM은 슈퍼클래스에서 foo메소드를 찾아
			// 결과값 A를 출력한다.

		Sp s2 = (Sp)s1;
			s2.foo();
			//s2는 s1을 명시적으로 업캐스트 한 Sub타입 인스턴스 값을 가진 변수이다.
			//s2.foo();는 명시적으로 업 캐스트 되었기때문에 Sp클래스에서 foo()를 찾아
			//결과값 A를 출력한다.

			// 결과는 AA를 출력한다.
		System.out.println();
	}
}
class A{}
class B extends A{}
class Test{
	public static void main(String[] args){
		A x = new A();
		A y = new B();
		B v = new A(); // compile Error 
					   // 서브클래스 타입의 변수 y 에 슈퍼클래스 타입의 A의 인스턴스를
					   // 캐스트 B y = (B)new A(); 으로 기술하면 컴파일 에러를 발생하지 않는다.
					   // 단 실행시에 ClassCastException이 발생된다.

		B u = new B();
	}
}
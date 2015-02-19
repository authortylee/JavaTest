class A{}
class B extends A{}
class C extends A{}
class Test{
	public static void main(String[] args){
		A x;         // SuperClass Type A 변수는 x
		x = new B(); // A타입 x에 서브타입 B 의 인스턴스를 대입
		B y = (B)x;  // B타입의 변수 y에 A타입 변수 x를 대입 인스턴스는 B타입이기에 문제 문제 없음
		C z = (C)y;  // class B와 class C사이의 호환성은 없다. Compile Error 가 발생

	}
}
class A{
	void foo(){
		System.out.println("A");
	}
}

class B extends A{
	void foo(int x){
		System.out.println("B");
	}
}

class C extends B{
	void foo(int x , double d){
		System.out.println("C");
	}
}

class Test{
	public static void main(String[] args){
		A x = new C();
		B y = (C)x;
		y.foo(); // 결과값은 A
		y.foo(3);// 결과값은 B
		y.foo(3,3.3); // Compile Error y는 C타입의 인스턴스이지만 형태는 B 형태이다.
					  // 클래스 B에는 슈퍼클래스 A에서 상속받은 foo() 메소드와
					  // 자신의 클래스 내애서 정의된 foo(int x) 이외에는 없다.
					  // 그래서 foo(int x , double d) 메소드는 가지고 있지 않은것과 마찬가지
					  // 결과 메소드를 찾을 수 없어 컴파일 에러가 된다.

	}
}
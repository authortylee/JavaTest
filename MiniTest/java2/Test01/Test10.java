class Sp{
	static void foo(int x){
		System.out.println("Sp");
	}
}

class Sub extends Sp{
	static void foo(int x){
		System.out.println("Sub");
	}
}

class Test{
	public static void main(String[] args){
		Sub sb = new Sub();
		Sp sp = sb;
		sp.foo(5);
		// 결과값은 A 이다 스타틱 메소드는 오버라이드 되지 않는다. 그리고 변수의 형태를 따라간다.
		// 결과는 A가 된다. 인스턴스였다면 B 가 출력된다. 단 인스턴스와 스타틱 메소드 사이에는
		// 컴파일 에러를 뿜어낸다. 즉
		// 
	}
}
abstract class Sp{
	void foo(int... x){
		System.out.print("A");
	}
}
class Sub extends Sp{
	protected void foo(int... x){
		System.out.print("B");
	}
}

class Test{
	public static void main(String[] args){
		Sp s = new Sub();
		s.foo(3,5);
	}
}

/*
結果は A 

변수 s는 Sp형태이다. 먼저 Sp에서 메소드를 찾는다.
Sp클래스에서 foo(int... x) 와 Sub클래스에서 foo(int x, int y)는 오버로드 관계이다.
즉 Sp클래스에서 받을 수 있는 메소드가 없다면 서브클래스에서 찾지 않는다 . 
컴파일 에러가 발생된다.
오버라이드 관계였다면 결과는 B를 출력한다.
*/
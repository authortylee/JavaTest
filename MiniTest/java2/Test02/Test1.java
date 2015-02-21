class Sp{}

class Sub extends Sp{
	static void foo(){
		System.out.print("A");
	}
}

class Test{
	public static void main(String[] args){
		Sub.foo();
		Sp s = new Sub();
	
		s.foo();
		// s의 형태는 Sp이다. Sp클래스에는 메소드 foo() 가 없다. 그래서 컴파일 에러
		
	}
}
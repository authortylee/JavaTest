class Sp{
	int x;
}

class Sub extends Sp{
	void foo(){
		x++;
	}

	void foo(int x){
		x++; // 여기의 변수 x는 foo(int x) 메소드 선언에 있는 메소드 로컬 변수 x를 
			 // 지정한다. 필드변수 x를 이용하려면 this.x로 지정 해야 한다.
	}
}

class Test{
	public static void main(String[] args){
		Sub s = new Sub();
		s.foo();
		s.foo(2);
		s.foo(2);
		System.out.println(s.x);
	}
}
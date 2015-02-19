class Sp{
	int x;
}

class Sub extends Sp{
	void foo(){
		x++;
	}

	void foo(int x){
		this.x++;
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
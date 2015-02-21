abstract class Sp{
	abstract void foo(int x);
	void bar(){
		System.out.print("B");
	}
}

class Sub extends Sp{
	void foo(int x){
		System.out.print("A");
	}
}

class Test{
	public static void main(String[] args){
		Sp s = new Sub();
		s.foo(5);
		s.bar();
	}
}
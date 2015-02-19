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
		y.foo();
		y.foo(3);
		y.foo(3,3.3);

	}
}
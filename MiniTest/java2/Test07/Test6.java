interface I {
	int x = 10;
}

class C{
	void foo(){
		System.out.print("A");
	}
}

class Test extends C implements I{
	public static void main(String[] args){
		Test t = new Test();
		t.foo();
		System.out.print(Test.x);
	}
}
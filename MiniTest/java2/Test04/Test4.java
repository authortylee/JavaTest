class T{
	public void foo(){
		System.out.print("A");
	}
}

class S1 extends T{
	public void foo(){
		System.out.print("B");
	}
}

class S2 extends T{
	public void foo(){
		System.out.print("C");
	}
}

class MyClass{
	void callFoo(T t){
		t.foo();
	}
}

class Test{
	public static void main(String[] args){
		MyClass mc = new MyClass();
		mc.callFoo(new S1());
		mc.callFoo(new S2());

		System.out.println();
	}
}
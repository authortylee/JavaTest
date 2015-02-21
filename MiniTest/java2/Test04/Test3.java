class T{
	void foo(){
		System.out.print("A");
	}
}
class S1 extends T{
	protected void foo(){
		System.out.print("B");
	}
}

class S2 extends S1{
	public void foo(){
		System.out.print("C");
	}
}

class Test{
	public static void main(String[] args){
		S1 s = new S1();
		s.foo();
	}
}

// 결과는 B 로 ... 초간단문제
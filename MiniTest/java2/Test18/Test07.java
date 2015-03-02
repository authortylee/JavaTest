class X{
	int d;
	X(int x){
		this.d = x;
	}
	void foo(){

	}
}

class Test{
	public void foo(X x){
		x.foo();
	}

	public static void main(String[] args){
		Test t = new Test();
		t.foo(new X(10){
			void foo(){
				System.out.println(d);
			}
		});
	}
}
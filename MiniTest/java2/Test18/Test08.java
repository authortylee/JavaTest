interface IF{
	void foo();
}

class Test{
	public void foo(IF i){
		i.foo();
	}
	public static void main(String[] args){
		Test t = new Test();
		t.foo(new IF(){
			public void foo(){
				System.out.println("A");
			}
		});
	}
}
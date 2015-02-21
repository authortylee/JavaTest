interface If1{
	void foo();
}

interface If2{
	void bar();
}


class S implements If1,If2{
	public void foo(){
		System.out.print("A");
	}
	public void bar(){
		System.out.print("B");
	}
}

class Test{
	public static void main(String[] args){
		If1 i1 = new S();
		i1.foo();
		//i1.bar(); //ここでcompile Error interface If1 ではbar() Methodを持ってない
				  //それで If1型変数i1ではbar()を実行できない
	}
}
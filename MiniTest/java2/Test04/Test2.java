class Sp{
	public void foo(){
		System.out.print("A");
	}
}
class Sub extends Sp{
	void foo(){		// Access Level Compile Error
		System.out.print("B");
	}
}


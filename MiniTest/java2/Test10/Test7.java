class MyException extends Exception{

}

class MyClass{
	void foo() throws MyException{
		System.out.print("A");
	}
}

class Test{
	public static void main(String[] args){
		MyClass mc = new MyClass();
		mc.foo();
		System.out.print("B");
	}
}
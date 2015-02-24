class MyException extends Exception{

}

class Test{
	static void foo(){
		throw new MyException();
	}
}
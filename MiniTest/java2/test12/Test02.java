class MyException extends Exception{}

class Test{
	static int foo(int x) throws MyException{
		return x * 2;
	}
	public static void main(String[] args){
		byte b = 2;
		short s = 3;
		try{
			s = (short)(b*s); // 예외는 발생하지 않는다. b*s = 6 
			System.out.println(foo(s)); // foo(s) = 12
		}catch(Exception e){
			System.out.println("A");
		}
	}
}
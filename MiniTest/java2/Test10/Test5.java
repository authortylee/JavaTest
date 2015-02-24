class Test{
	public static void main(String[] args){
		int a = 1 , b = 0 , c = 0;

		try{
			c = a/b;
			System.out.println("try");
		}catch(Exception e){
			System.out.println("catch1");
		}catch(ArithmeticException e){// compile error
			System.out.println("cathc2");
		}

		System.out.println("end");
	}
}
class Test{
	public static void main(String[] args){
		int a = 1 , b = 0;
		int c = 0;

		try{
			c = a/b; // Exception ArithmeticException
			System.out.println("try"); // No Processing
		}catch(ArithmeticException e){
			System.out.println("catch");
		}	
		System.out.println("end");
	}
}
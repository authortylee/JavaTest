class Test{
	public static void main(String[] args){
		int a = 1 , b = 0, c = 0;

		try{
			c = a/b;
			System.out.println("try");
		}catch(ArithmeticException e){
			System.out.println("catch1");
		}catch(Exception e){
			System.out.println("catch2");
		}
		System.out.println("end");
	}
}
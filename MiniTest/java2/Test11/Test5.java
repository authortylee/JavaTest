class Test{
	public static void main(String[] args){
		try{
			int x = 3;
			int y = 0;
			int z = x/y;
			System.out.println("try");
		}catch(Exception e){
			System.out.println("catch");
			return;
		}finally{
			System.out.println("finally");
		}
		System.out.println("end");
	}
}
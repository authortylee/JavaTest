class Test{
	public static void main(String[] args){
		int assertion = 10;
		switch(assertion /=8){
			case 0 :
				System.out.println("A"); break;
			case 1 :
				System.out.println("B"); break;
			default:
				assert false;
		}
	}
}
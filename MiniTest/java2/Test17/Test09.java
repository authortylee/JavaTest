interface IF{
	void method();
}

class A{
	IF c = new IF(){
			// Noname InnerClass
		public void method(){
										System.out.println("A");
										}
	}; // InnerClass ; << 
}

class Test{
	public static void main(String[] args){
		A a = new A();
		a.c.method();
	}
}
class Sp{
	static int foo(){
		return 5;
	}
}

class Sub extends Sp{
	static double bar(){
		return foo();
	}
}

class Test{
	public static void main(String[] args){
		Sub s = new Sub();
		System.out.println(s.bar());
	}
}
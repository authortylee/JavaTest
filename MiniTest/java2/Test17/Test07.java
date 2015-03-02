class Outer{
	static class Inner{
		public void foo(){
			System.out.println("A");
		}
		public static void foo(int x){
			System.out.println("B");
		}
	}
}

class Test{
	public static void main(String[] args){
		// static Inner 클래스의 인스턴스화ㅏ

		Outer.Inner i = new Outer.Inner();
		// static Inner 클래스를 인스턴스화 하고 Inner클래스의 인스턴스메소드 foo()를 실행함.
		new Outer.Inner().foo();
		new Outer.Inner().foo(9);
	}
}
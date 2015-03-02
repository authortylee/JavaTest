abstract class X{
	void foo(){
		System.out.println("A");
	}
}

class Test{
	public static void main(String[] args){
		X x = new X(){
			void foo(){
				System.out.println("B");
			}
			void hoge(){
			}
		};
		x.foo();
		x.hoge(); // Complie Error 인터페이스에 없는 메소드이다. 즉 무명 클래스의 메소드를 불러올때는 오버라이드 된것만
				  // 가능하다는 뜻이다. 정의하는 것에는 문제가 없다.
	}
}
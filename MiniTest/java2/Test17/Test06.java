class Outer{
	int x = 10;
	class Inner{
		int x;
		public Inner(int x){
			this.x = x;
		}
		public void foo(){
			System.out.println(x);
		}
	}

	public void bar(){
		new Inner(7).foo(); // 같은 아두터 클래스의 메소드
							// 여기서 Inner class 를 인스턴스화
							// 인자는 인트 7
							// 그리고 .foo() Inner클래스의 메소드이다.
	}
}

class Test{
	public static void main(String[] args){
		new Outer().bar();
	}
}
/*
* generics 

*/

class Box<T>{
	private T t;
	public T getT(){
		return t;
	}
	public void setT(T t){
		this.t = t;
	}
}

class Test{
	public static void main(String[] args){
		// 제네릭 인스턴스의 생성방법

		Box<Integer> box = new Box<Integer>();
		// Box<Integer> 타입 변수 box에 
		//	Box<Integer> 인스턴스참조값을 대입함.
		Box<Number> box = new Box<Integer>();
		// compile Error Integer클래스는 Number클래스의 서브타입이지만
		// 제네릭클래스에서는 호환성이 없다.
		Box<Integer> box = new Box();
		// Box<Integer> 타입 변수 box에 Box()인스턴스 참조값을 대입. 경고가 나온다.
		Box box = new Box<String>();
		Box box = new Box();
	}
}
class Test{
	static void methodA(){
		try{
			int[] a = new int[3];
			a[3] = 10;						//3. 예외발생
			System.out.println("A");
		}catch(Exception e){
			System.out.println("B");		//4.발생된 예외를 처리함. 출력 B
		}
	}
	static void methodB(){
		try{
			methodA();						//2 methodA() 호출
			System.out.println("C");		//5. 정상적으로 처리되고 methodB()처리 종료 
		}catch(Exception e){
			System.out.println("D");
		}
	}
	public static void main(String[] args){
		try{
			methodB();						//1. methodB() 호출
			System.out.println("E");		//6. 정상적으로 처리되고 메인 메소드 종료 
		}catch(Exception e){
			System.out.println("F");
		}
	}
}

// 결과는 B C E 이다. 발생된 예외는 단 한번만 처리된다.
// 만약 7행에서 전혀다른 예외상황처리를 진행한다면?
// 예를들어 catch(Exception e) 를 catch(NullPointerException e) 라고 한다면 
// 결과는 D , E 가 된다. 
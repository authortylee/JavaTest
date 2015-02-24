class MyException extends Exception{
	public MyException(String message){
		super(message);
	}
}

class Calc{
	private int result;
	public void div(int x , int y) throws MyException{
		if(y!=0){
			this.result = x / y;
		}else{
			throw new MyException("0으로 나눌 수 없습니다.");
		}
	}
	public int getResult(){
		return result;
	}
}

class Test{
	public static void main(String[] args){
		int x = 10, y = 0;
		int result = 0;
		Calc calc = new Calc();
		try{
			calc.div(x,y);
			result = calc.getResult();
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch(RuntimeException e){
			System.out.println("RuntimeException");
		}catch(MyException e){
			System.out.println("MyException");
		}catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println("end");
	}
}
// 결과는 MyException end  이다.
//Test 클래스 27행에서 Calc클래스의 인스턴스 참조인 calc의 div메소드에 인트값 10과 0을 입력
//div메소드는 thorws문이 작성되어있다. Calc 클래스의 div메소드에서 if(y!=0) 이 false일경우
// new MyException() 인스턴스를 생성하고 이는 div 메소드의 선언문에서 throws MyException에
//의해서 Test클래스에 반환되고 Test클래스에서는 try catch에서 33행에서 예외를 처리
//마지막으로 catch블록 밖에있는 System.out.println("end");를 처리하고 종료.
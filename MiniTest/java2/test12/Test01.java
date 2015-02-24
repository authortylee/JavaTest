class Test{
	public static void main(String[] args){
		int x =10, y= 10;
		try{
			x -= 10;
			y/=x;      // ArithmeticException 발생 
			System.out.print(x + " : " + y); // 처리되지 않음
		}catch(Exception e){
			x = 1;
			y = 2;
		}finally{
			System.out.print(x + " : " + y);			
		}
	}
}

/*
	결과는 1 : 2
	예외가 발생되면서 catch(Exception e) 블록이 처리된다.
	x , y에 각각 1 , 2 를 대입 finally안에서 출력하면서 종료.

*/
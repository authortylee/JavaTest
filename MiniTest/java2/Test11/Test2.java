class MyException extends Exception{

}

class Data{
	int x;
	Data(int x) throws MyException{
		if(x >=0){
			this.x = x;
		}else{
			throw new MyException();
		}
	}
}

class Test{
	public static void main(String[] args){
		Data d = null;
		try{
			d = new Data(-1);
			System.out.println("A");
		}catch(Exception e){
			System.out.println("B");
		}
	}
}
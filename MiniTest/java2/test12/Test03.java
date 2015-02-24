class MyException extends Exception{
}

class Data{
	private int x ;
	public void setX(int x) throws MyException{
		if(x>0){
			this.x = x;
		}else{
			throw new MyException();
		}
	}
	public int getX(){
		return this.x;
	}
}

class Test{
	public static void main(String[] args){
		Data d = new Data();
		try{
			d.setX(-10);
			System.out.println(d.getX()+1);
		}catch(Exception e){
			System.out.print(d.getX()+2);
		}
	}
}
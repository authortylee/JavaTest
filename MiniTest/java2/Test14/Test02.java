class Data{
	int d;
	Data(int _d){
		if(_d >= 0){
			d = _d;
		}else{
			assert false;
		}
	}
}

class Test{
	public static void main(String[] args){
		Data data = new Data(-1);
		System.out.println(data.d);
	}
}
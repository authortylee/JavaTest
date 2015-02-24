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

// java -ea Test 로 실행할경우 7행에서 assertionError 이 발생한다.
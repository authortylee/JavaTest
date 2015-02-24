class Test{
	public static void main(String[] args){
		int[] a = new int[3];
		try{
			for(int i = 1; i <=3 ; i++) // a[1] , a[2] 연산됨 
				a[i] += i;
		}catch(Exception e){

		}

		for(int i : a)
			System.out.print(i + ":");
	}
}

// 결과는 0:1:2 
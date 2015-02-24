class Test{
	public static void main(String[] args){
		int[] a = {1,3,5,7};
		for(int i = 0 ; i <=a.length; i++)
			System.out.println(a[++i]);
	}
}

// 결과는 3 , 7  ArrayIndexOutOfBoundsException 
//
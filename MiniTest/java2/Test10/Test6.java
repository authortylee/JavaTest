class Test{
	public static void main(String[] args){
		int a = 4 , b = 2;
		int c = 0;

		try{
			c = a/b; // 問題ないコード
			System.out.println("try"); // 出力されます。
		}catch(Exception e){ // try｛｝中で例外は生じないためこのブロックは処理されない
			System.out.println("catch");
		}finally{ //このブロックは try catch の結果には問わずに処理されます。
			System.out.println("finally");
		}

		//結果は try finally 出力されます。
	}
}
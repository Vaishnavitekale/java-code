class code4{
	public static void main(String[] ars){
		char start=1;
		char end=6;
		while(start!=end+1){
			if(start%2==1){
			System.out.print((char)(start+64) +" ");
			}
			else{
			System.out.print((start+0) +" ");
			}
			start++;
		}
	}
}

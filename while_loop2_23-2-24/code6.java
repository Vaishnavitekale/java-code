class code6{
	public static void main(String[] arg){
		int num=234;
		int prod=1;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			prod=prod*num1;
		}
		System.out.println(prod);
	}
}

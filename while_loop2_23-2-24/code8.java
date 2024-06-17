class code8{
	public static void main(String[] arg){
		int num=256985;
		int prod=1;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==1){
			prod=prod*num1;
		}
		}
		System.out.println("product of odd digit : "+prod);
	}
}

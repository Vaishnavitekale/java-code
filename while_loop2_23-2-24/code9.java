class code9{
	public static void main(String[] arg){
		int num=2469185;
		int sum=0;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==1){
			sum=sum+(num1*num1);
		}
		}
		System.out.println(sum);
	}
}

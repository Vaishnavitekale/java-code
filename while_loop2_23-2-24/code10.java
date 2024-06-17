class code10{
	public static void main(String[] arg){
		int num=9367924;
		int sum=0;
		int prod=1;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==1){
			sum=sum+num1;
		}
			else{
				prod=prod*num1;
		}
		}
		System.out.println("sum of odd digit : "+sum);
		System.out.println("product of even digit : "+prod);
	}
}

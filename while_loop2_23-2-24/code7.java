class code7{
	public static void main(String[] arg){
		int num=256985;
		int sum=0;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==0){
			sum=sum+num1;
		}
		}
		System.out.println("sum of even digit : "+sum);
	}
}

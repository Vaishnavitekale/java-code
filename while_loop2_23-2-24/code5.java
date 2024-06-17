class code5{
	public static void main(String[] arg){
		int num=216985;
	
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==0){
				System.out.print(num1*num1*num1+" ");
			}
		}
	}
}

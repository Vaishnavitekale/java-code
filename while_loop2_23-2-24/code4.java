class code4{
	public static void main(String[] arg){
		int num=256985;
	
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==1){
				System.out.print(num1*num1+" ");
			}
		}
	}
}

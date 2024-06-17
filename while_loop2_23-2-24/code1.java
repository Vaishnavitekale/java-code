class code1{
	public static void main(String[] arg){
		int num=2169185;
		System.out.print("digits divisible by 2 are: "+" ");
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==0){
				System.out.print(num1+" ");
			}
		}
	}
}

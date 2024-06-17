class code3{
	public static void main(String[] arg){
		int num=436780521;
		System.out.print("digits divisible by 2 or 3 are: "+" ");
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==0||num1%3==0){
				System.out.print(num1+" ");
			}
		}
	}
}

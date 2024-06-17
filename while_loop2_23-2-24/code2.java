class code2{
	public static void main(String[] arg){
		int num=2569185;
		System.out.print("digits not  divisible by 3 are: "+" ");
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%3!=0){
				System.out.print(num1+" ");
			}
		}
	}
}

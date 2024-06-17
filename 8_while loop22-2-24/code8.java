class code8{
	public static void main(String[] ars){
		int num=216895;
		
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==1){
			System.out.println(num1);
			}
		}
	}
}

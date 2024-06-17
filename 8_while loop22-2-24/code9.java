class code9{
	public static void main(String[] ars){
		int num=214367689;
		int count1=0;
		int count2=0;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			if(num1%2==0){
				count1++;
			}
			else{
			count2++;
			}
		}
			System.out.println("even count "+count1);
			System.out.println("odd count "+count2);
		
	}
}

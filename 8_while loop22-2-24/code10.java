class code10{
	public static void main(String[] ars){
		long  num=9307922405l;
		long sum=0l;
		while(num!=0){
			long num1=num%10;
			num=num/10;
			sum=sum+num1;
		}
			System.out.println("sum "+sum);
		
	}
}

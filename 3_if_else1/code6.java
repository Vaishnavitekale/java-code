class code6{
	public static void main(String[] arg){
		int num=15;
		if (num%7==0 && num%3==0){
			System.out.println(num+ " is divisible by 7 and 3");
		}
		else  if (num%3==0){
                        System.out.println(num+ " is divisible by 3");
                }
		else  if (num%7==0){
                        System.out.println(num+ " is divisible by 7");
                }
		else{
			 System.out.println(num+ " is not divisible by 7 nor 3");
		}
	}
}

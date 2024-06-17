class code3{
	public static void main(String[] arg){
		int num=13;
		if (num%2==0 && num>10){
			System.out.println(num+ " is even and greater than 10");

		}
		else  if (num%2==0 && num<10){
                        System.out.println(num+ " is even and less than 10");
                }
		else  if (num%2!=0 && num>10){
                        System.out.println(num+ " is odd and greater than 10");
                }
		else  if (num%2!=0 && num<10){
                        System.out.println(num+ " is odd and less than 10");
                }
		else{
			 System.out.println(num+ " is zero");
		}
	}
}

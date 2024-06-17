class code4{
	public static void main(String[] args){
		float num=87f;
		if(num>85.00 && num<100.00){
			System.out.println("Medical");

		}
		else if(num<=85.00 && num>75.00){
                        System.out.println("Engineering");

                }
		else if(num<=75.00 && num>=65.00){
                        System.out.println("Pharmacy or bachelor in science");

                }
		else{
			System.out.println(num+"graduation");	
	}
}
}

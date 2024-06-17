class code7{
	public static void main(String[] args){
		int selling_price=100;
		int cost_price=20;
		int profit=cost_price-selling_price;
		int loss=selling_price-cost_price;
		if(cost_price>selling_price){
			System.out.println(profit+" is the profit");

		}
		else if(cost_price==selling_price){
			System.out.println("No loss and  profit");
		}
		else{
			System.out.println(loss+" is loss");	
	}
}
}

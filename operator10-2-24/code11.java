class code11{
	public static void main(String[] args){
		double num=10.9;
		if(true){
			System.out.println(num++ + ++num + ++num + ++num);
		}
		System.out.println(num-10);
		if (num>0){
			num=10;
		}
		System.out.println(num);
	}
}

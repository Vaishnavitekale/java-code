import java.util.*;
class code3{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. :");
		int num=sc.nextInt();
		boolean isPrime=true;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
				isPrime=false;
				break;
				}			
		}
		if(isPrime){
		System.out.println(num+ " is not  composite number");}
		else{
		System.out.println(num+" is composite no.");
	}
}
}



				

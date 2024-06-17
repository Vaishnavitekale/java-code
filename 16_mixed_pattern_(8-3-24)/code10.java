import java.util.*;
class code10{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		
		long num=sc.nextLong();
		while(num!=0){
			long num1=num%10;
			num=num/10;
			if(num1%2==1){
				System.out.print(num1*num1+",");
			}
		}
		

	}
}


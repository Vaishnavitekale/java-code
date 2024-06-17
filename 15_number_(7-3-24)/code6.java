import java.util.*;
class code6{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		
		int num=sc.nextInt();
		int revnum=0;
		int num2=num;
		while(num!=0){
			int num1=num%10;
			num=num/10;
			revnum=revnum*10+num1;
		}
		if(num2==revnum){
			System.out.print(num2 +" is palindrome number");}
			else{	System.out.print(num2 +" is not palindrome number");
			
		}
	}
}


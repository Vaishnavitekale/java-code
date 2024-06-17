import java.util.*;
class code4{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. :");
		int num=sc.nextInt();
		int mul=1;
			for(int i=1;i<=num;i++){
				mul=mul*i;
			}
		System.out.println( " factorial of "+num+" is "+mul);
	}
}




				

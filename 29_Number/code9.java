import java.util.*;
class Code9{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int num1=0;
		int sum=0;
		int original=num;
		System.out.println();
		while(num!=0){
			num1=num%10;
			num=num/10;
			sum=sum+num1;
		}
		if(original%sum==0){
			System.out.println(original+" is harshad number");
		}
		else{

			System.out.println(original+" is not harshad number");
	}
	}
}


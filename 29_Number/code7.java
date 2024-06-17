import java.util.*;
class Code7{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int num1=0;
		int num3=0;
		int original=num;
		System.out.println();
		while(num!=0){
			
			num1=num%10;
			num=num/10;
			num3=num3+num1*num1;
		}
		if(num3==1){
			System.out.println(original+" is happy  number");
		}
		else{

			System.out.println(original+" is not happy number");
	}
	}
}


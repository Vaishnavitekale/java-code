import java.util.*;
class Code10{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int num1=0;
		int num3=0;
		int count=0;
		int original=num;
		System.out.println();
		
		while(num!=0){
			
			num=num/10;
			count++;
		}
		num=original;
		while(num!=0){
			num1=num%10;
			num=num/10;
			num3=((int)(Math.pow(num1, count)))+num3;
		}
		if(original==num3){
			System.out.println(original+" is Armstrong number");
		}
		else{

			System.out.println(original+" is not Armstrong number");
	}
	}
}



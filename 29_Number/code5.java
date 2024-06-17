import java.util.*;
class Code5{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int num1=num*num;
		int count=0;
		int original=num;
		System.out.println();
		while(num!=0){
			
			num=num/10;
			count++;
		}
		int num3=num1%((int)(Math.pow(10, count)));
		if(original==num3){
			System.out.println(original+" is Automorphic number");
		}
		else{

			System.out.println(original+" is not Automorphic number");
	}
	}
}


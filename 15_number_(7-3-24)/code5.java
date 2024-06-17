import java.util.*;
class code5{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr a number: ");
		int num=sc.nextInt();
		System.out.print("Reverse of "+num+" is ");
		while(num!=0){
			int num1=num%10;
			num=num/10;
			System.out.print(num1);
		}
	}
}


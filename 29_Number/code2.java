import java.util.*;
class Code2{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int num1=0;
		int num2=num;
		int strg=0;
		while(num!=0){
			int fact=1;
			num1=num%10;
			num=num/10;
			for(int i=1;i<=num1;i++){
				fact=fact*i;
			}
			strg=strg+fact;
			}
		
		System.out.println();
		if(strg==num2){
			System.out.println(num2+" is strong number");
		}
		else{

			System.out.println(num2+" is not strong number");
	}
	}
}


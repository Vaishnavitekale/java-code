import java.util.*;
class Code1{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		System.out.println();
		if(sum==num){
			System.out.println(num+" is perfect number");
		}
		else{

			System.out.println(num+" is not perfect number");
	}
	}
}


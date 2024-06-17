import java.util.*;
class Code4{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int sum=0;
		if (num == 1) {
        	    System.out.println("1 is not a Abundant number");
        		}

		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum=sum+i;
				System.out.println(sum);
			}
		}

		System.out.println();
		
		if(sum<num){
			System.out.println(num+" is Abundant number");
		}
		else{

			System.out.println(num+" is not Abundant number");
	}
	}
}


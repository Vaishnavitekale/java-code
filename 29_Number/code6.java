import java.util.*;
class Code6{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		System.out.println();
		int prev1=0;
		int prev2=1;
		int count=0;
		int fibo=0;
		System.out.print(prev1+",");
		System.out.print(prev2+",");
		while(count!=num-2){
			
			fibo=prev1+prev2;
			prev1=prev2;
			prev2=fibo;
			count++;
			System.out.print(fibo+",");
		}
			System.out.println();
	}
	}



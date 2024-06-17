import java.util.*;
class code1{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. :");
		int num=sc.nextInt();
		System.out.print("factors of "+num+" are ");
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.print(i+",");
			}
		}
	}
}


				

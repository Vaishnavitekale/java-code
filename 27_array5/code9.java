import java.util.*;
class Code9{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a no.: ");
		int num=sc.nextInt();
		int size=String.valueOf(num).length();
	
		int arr[]= new int[size];
		int num1=0;

			
				for(int i=size-1;i>=0;i--){
				num1=num%10;
				num=num/10;
			arr[i]=num1+1;
				}
				for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
				}
		}
		}




import java.util.*;
class Code1{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int sum=0;		
		int  arr[]=new int [size];
		for(int k=0;k<size;k++){
			System.out.print("Enter Element "+(k+1)+" : ");
			arr[k]=sc.nextInt();
			sum=sum+arr[k];
			System.out.println();
		}
		

		
			System.out.println("Average sum of array element is "+(sum/size));
		
		
}
}

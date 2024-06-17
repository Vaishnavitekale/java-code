import java.util.*;
class Code2{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		
		int  arr[]=new int [size];
		for(int k=0;k<size;k++){
			System.out.print("Enter Element "+(k+1)+" : ");
			arr[k]=sc.nextInt();
			System.out.println();
		}
		int temp1=arr[0];
		int temp2=arr[0];



		for(int k=0;k<size;k++){
			if(arr[k]>=temp1){
				temp1=arr[k];
			}			
			if(arr[k]<=temp2){
				temp2=arr[k];
			}			
		}
		

		
			System.out.println("difference between min and max elements  is "+(temp1-temp2));
		
		
}
}

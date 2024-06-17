import java.util.*;
class Code5{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int temp=0;
		
		int  arr[]=new int [size];
		for(int k=0;k<size;k++){
			System.out.print("Enter Element "+(k+1)+" : ");
			arr[k]=sc.nextInt();
			System.out.println();
		}



		for(int k=0;k<size/2;k++){
			temp=arr[k];
			arr[k]=arr[size-k-1];
			arr[size-1-k]=temp;
			
			
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
		
}
}

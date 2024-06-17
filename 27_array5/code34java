import java.util.*;
class Code1{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		int count=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++){
			if(arr[i]<arr[i+1]){
				count++;
			}
		}
		if(count==size-1){
			System.out.print("Array is in ascending order");
		}
		else{
			System.out.print("Array is not in ascending order");
		}
	}
}


import java.util.*;
class Code8
{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		int min1=0;
		int min2=0;
		int index=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		min1=arr[0];
		for(int i=0;i<size;i++){
				if(arr[i]<=min1){
					min1=arr[i];
					index=i;
					}
			}
			System.out.println(min1+" is first minimum element");
			if(index==0){
				min2=arr[index+1];
			}
			else{
				min2=arr[0];
			}
		for(int i=0;i<size;i++){
				if(arr[i]<=min2 && arr[i]!=min1){
					min2=arr[i];
					}
			}
		
			System.out.print(min2+" is second minimum element");
		}
		}
	




import java.util.*;
class Code1{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int [size];
	int count=0;

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.nextInt();
		}
		System.out.print("Even Number: ");
	for(int i=0;i<size;i++){
		if(arr[i]%2==0){
			count++;
		System.out.print(arr[i]+" ");

		}
	}

		System.out.println();
		
		System.out.println("count of even no. : "+count);
	}
	}



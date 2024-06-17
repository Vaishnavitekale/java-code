

import java.util.*;
class Code9{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int [size];

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.nextInt();
	}

	int min=arr[0];
	for(int i=0;i<size;i++){
		if(arr[i]<min){
			min=arr[i];
	
		}
		}


		
		System.out.println("min no.in array is : "+min);

	}

}

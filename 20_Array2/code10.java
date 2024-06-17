

import java.util.*;
class Code10{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int [size];

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.nextInt();
	}

	int max=arr[0];
	for(int i=0;i<size;i++){
		if(arr[i]>max){
			max=arr[i];
	
		}
		}


		
		System.out.println("max no.in array is : "+max);

	}

}

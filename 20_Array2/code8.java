

import java.util.*;
class Code8{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int [size];
	

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++){
		if(arr[i]>5 && arr[i]<9){
		System.out.println(arr[i]+" is greater than 5 but less than 9 ");	
			
	
		}
		}

	}

}

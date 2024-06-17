

import java.util.*;
class Code5{
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
	for(int i=0;i<size;i++){
		if(i%2==1){
			count=arr[i]+count;
	
		}
		}

		System.out.println();	

		
		System.out.println("sum of odd indexed element. : "+count);

	}

}

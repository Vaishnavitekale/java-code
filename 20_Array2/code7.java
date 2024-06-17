

import java.util.*;
class Code7{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int [size];
	

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.nextInt();
	}
	if(size%2==0){
	for(int i=0;i<size;i+=2){
		System.out.println(arr[i]);
		}
		}
	else{
	for(int i=0;i<size;i++){
		System.out.println(arr[i]);
		}
		}

	}	

		

	
}

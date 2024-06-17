

import java.util.*;
class Code4{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int arr[]=new int [size];
	int index=0;
	int ele2=0;

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.nextInt();
	}
	
	System.out.print("enetr element to search: ");
	int ele=sc.nextInt();

	for(int i=0;i<size;i++){
		if(arr[i]==ele){
		index=i;
		ele2=ele;
		}
		}
	System.out.println(ele2+" found at index "+index);

	}

	}


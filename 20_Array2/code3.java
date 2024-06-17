

import java.util.*;
class Code3{
	public static void main(String[] arg){
	System.out.print("enetr size: ");
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	char arr[]=new char [size];
	

	for(int i=0;i<size;i++){
		System.out.print("enetr element: ");
		arr[i]=sc.next().charAt(0);
	}
	for(int i=0;i<size;i++){
		if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
			System.out.println("Vowel "+arr[i]+" found at index "+i);
			
	
		}
		}


		

	}

}

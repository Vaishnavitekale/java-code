import java.util.*;
class Code7{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int arr2=0;
		
		char  arr[]=new char [size];
		for(int k=0;k<size;k++){
			System.out.print("Enter character "+(k+1)+" : ");
			arr[k]=sc.next().charAt(0);
			System.out.println();
		}



		for(int k=0;k<size;k++){
			if(arr[k]>='a'&& arr[k]<='z'){
				arr2=arr[k]-32;
				System.out.println((char)arr2);
		
			}
			else{
				System.out.println(arr[k]);
			}
		}

		
}
}

import java.util.*;
class Code8{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int count=0;
		
		char  arr[]=new char [size];
		for(int k=0;k<size;k++){
			System.out.print("Enter character "+(k+1)+" : ");
			arr[k]=sc.next().charAt(0);
			System.out.println();
		}
		System.out.print("Enter Character key: ");
		char ch=sc.next().charAt(0);



		for(int k=0;k<size;k++){
			if(arr[k]==ch){
			count++;
			}
	
		}
		System.out.print(ch+" has occurred "+count+" times"); 

		
}
}

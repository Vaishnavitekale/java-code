import java.util.*;
class Code10{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int loop=0;
		
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
			break;
			}
			else{
				System.out.println(arr[k]);
			}
		}

		
}
}

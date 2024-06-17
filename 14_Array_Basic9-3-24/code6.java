import java.util.*;
class code6{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		char [] arr=new char[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter character "+(i+1)+" : ");
			arr[i]=sc.next().charAt(0);
			//"Enter character 1: ". The user enters Apple. charAt(0) takes the first character of the entered string, which is A. So, A is assigned to arr[0].
			
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
			

	}
}

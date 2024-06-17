import java.util.*;
class code8{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee count: ");;
		int size=sc.nextInt();
		int [] arr=new int[size];	
		for(int i=0;i<size;i++){
			System.out.print("Enter Employee "+(i+1)+" Age : ");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
			

	}
}

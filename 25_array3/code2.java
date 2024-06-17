import java.util.*;
class code2{
	public static void main(String [] arg){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int index=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("enetr specific no.: ");
		int num=sc.nextInt();
		for(int j=0;j<size;j++){
		if(arr[j]==num){
			index=j;
			break;
		}
		else{
		System.out.println(num+" not found" );


	}
		}
	System.out.println(num+" found at index "+index);
}
}



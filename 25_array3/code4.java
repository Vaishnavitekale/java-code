import java.util.*;
class code4{
	public static void main(String [] arg){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++){
			System.out.print(arr[j]+"\t");
		}
		System.out.println();
		for(int j=0;j<size;j++){
			if(arr[j]%2==0){
				arr[j]=0;
		}
		else{
			arr[j]=1;
		}
	}
		for(int j=0;j<size;j++){
			System.out.print(arr[j]+"\t");
		}
}
}


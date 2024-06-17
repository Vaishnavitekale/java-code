import java.util.*;
class code9{
	public static void main(String [] arg){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int count=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++){
			System.out.print(arr[j]+"\t");
		}
		System.out.println();
		for(int j=0;j<size;j++){
			for(int k=1;k<=arr[j];k++){
			if(arr[j]%k==0 && arr[j]!=1){
				count++;
		}
			}
			if(count<=2){
				System.out.print(arr[j]+"\t");
	}
		 count=0;
		}
	}
}
		


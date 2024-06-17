import java.util.*;
class Code7
{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		int count=0;
		int index=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("composite numbers are: ");
		for(int i=0;i<size;i++){
			count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
					}
			}
		if(count>2){
			System.out.print(arr[i]+",");
		}
		}
	}
}


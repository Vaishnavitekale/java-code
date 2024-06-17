import java.util.*;
class Code6
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
		for(int i=0;i<size;i++){
			count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
					index=i;
					}
			}
		if(count==2){
			System.out.print("first prime number at index "+index);
			
			break;
		}
		}
	}
}


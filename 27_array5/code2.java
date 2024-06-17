import java.util.*;
class Code2{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		int count=0;
		int count2=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				count=count+arr[i];
			}
			else{
				count2=count2+arr[i];
		}
		}
		System.out.println("sum of even element: "+count);
		System.out.println("sum of odd element: "+count2);
	}
}


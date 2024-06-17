import java.util.*;
class Code5{
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
			while(arr[i]!=0){
				arr[i]=arr[i]/10;
				count++;
				
			}
			System.out.print(count+",");
			}
		}
}



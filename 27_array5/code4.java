import java.util.*;
class Code4{
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
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-(i+1);j++){
			if(arr[i]==arr[j+(i+1)]){
				index=i;
				count++;
				break;
			}
			}
		}
		if(count>0){
			System.out.println("first duplicate element present at "+index);
		
			}
		else{
			System.out.println("no duplicate element present ");
		}
	}
}



import java.util.*;
class code6{
	public static void main(String [] arg){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.next().charAt(0);
		}
		for(int j=0;j<size;j++){
			System.out.print(arr[j]+"\t");
		}
		System.out.println();
		for(int j=0;j<size;j++){
		
			if(arr[j]!='a'&& arr[j]!='e'&& arr[j]!='i'&& arr[j]!='o'&&arr[j]!='u'){
				System.out.print(arr[j]+"\t");
			
		}
	}
}
		
}

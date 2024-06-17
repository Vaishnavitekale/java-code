import java.util.*;
class code10{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Students count: ");;
		int size=sc.nextInt();
		int [] arr=new int[size];	
		for(int i=0;i<size;i++){
			System.out.print("Enter Percentage of student with Rollno.  "+(i+1)+"  : ");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++){
			System.out.println("Percentage of Rollno. "+(i+1)+": "+arr[i]);
		}
			

	}
}

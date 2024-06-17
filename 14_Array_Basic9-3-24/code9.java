import java.util.*;
class code9{
	public static void main(String[] arg){
		int [] arr=new int[]{10,20,30,40,50,60,70,80,90,100};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int sum=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
			
		}

		for(int i=0;i<size;i++){
			if(i%2==1){
			System.out.println(arr[i]+" is odd indexed element");
			}
		}
			

	}
}

import java.util.*;
class code7{
	public static void main(String[] arg){
		int [] arr=new int[]{10,20,30,40,50,60,70,80,90,100};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		for(int i=0;i<size;i++){
			System.out.print("Enter element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++){
			if(arr[i]%4==0){
			System.out.println(arr[i]+" is divisible by 4 and its Index is "+i);
			}
		}
			

	}
}

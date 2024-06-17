import java.util.*;
class Code10
{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
	
		int fact=1;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("factorial: ");
		for(int i=0;i<size;i++){
			fact=1;
			for(int j=1;j<=arr[i];j++){	
			fact=fact*j;
			}
			System.out.print(fact+" ");
		}
					}
			}



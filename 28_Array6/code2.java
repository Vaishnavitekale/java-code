import java.util.*;
class Code2
{
        public static void main(String [] arg){
                Scanner sc=new Scanner (System.in);
                System.out.print("Enter size: ");
                int size=sc.nextInt();
                int arr[]= new int[size];
                int count=0;
                int sum=0;
		int count2=0;
                for(int i=0;i<size;i++){
                        System.out.print("Enter element: ");
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
                        count=0;
                        for(int j=1;j<=arr[i];j++){
                                if(arr[i]%j==0){
                                        count++;
                                        
                                        }
                        }
                if(count==2){
			count2++;
			sum=sum+arr[i];
                }
                }
		System.out.println("sum of all prime no. "+sum+" and count of prime number in given array is "+count2); 
        }
}

import java.util.*;
class Code10
{
        public static void main(String [] arg){
                Scanner sc=new Scanner (System.in);
                System.out.print("Enter size: ");
                int size=sc.nextInt();
                int arr[]= new int[size];
                int max1=0;
                int max2=0;
                int index=0;
		int max3=0;
                for(int i=0;i<size;i++){
                        System.out.print("Enter element: ");
                        arr[i]=sc.nextInt();
                }
                max1=arr[0];
                for(int i=0;i<size;i++){
                                if(arr[i]>=max1){
                                        max1=arr[i];
                                        index=i;
                                        }
                        }
                        /*if(index==0){
                                max2=arr[index+1];
                        }
                        else{
                                max2=arr[0];
                        }*/
                for(int i=0;i<size;i++){
                                if(arr[i]>=max2 && arr[i]!=max1){
                                        max2=arr[i];
                                        }
                        }
                for(int i=0;i<size;i++){
                                if(arr[i]>=max3 && arr[i]!=max2 && arr[i]!=max1){
                                        max3=arr[i];
                                        }
                        }

                        System.out.print(max3+" is third maximum element");
                
	}}

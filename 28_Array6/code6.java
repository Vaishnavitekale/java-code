import java.util.*;
class Code6{
        public static void main(String[] arg){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter size of Array: ");
                int size=sc.nextInt();
                int temp=0;

                int  arr[]=new int [size];
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
                        arr[k]=sc.nextInt();
                        System.out.println();
                }
                System.out.print("enetr no. to check : ");
                int num=sc.nextInt();



                for(int k=0;k<size;k++){
                        if(arr[k]%num==0){
				temp=k;
                	System.out.println("An elelment multiple of "+num+" found at  index: "+temp);
                        
               }
	
		}
		System.out.println();

		if(temp==0){
			System.out.println("no element found");
		}
	}
}

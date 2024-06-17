import java.util.*;
class Code7{
        public static void main(String[] arg){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter size of Array: ");
                int size=sc.nextInt();

               int  arr[]=new int [size];
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
			
			if(arr[k]>=65 && arr[k]<=90){
                        arr[k]=sc.next().charAt(0);
			}
			else{
                        arr[k]=sc.nextInt();
			}
                        
                }
		for(int k=0;k<size;k++){
			if(arr[k]>=65 && arr[k]<=90){
                        System.out.print((char)arr[k]+ " ");
			}
			else{
                        System.out.print(arr[k]+ " ");
			}

	}
	}
}


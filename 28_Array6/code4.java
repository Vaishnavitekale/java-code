import java.util.*;
class Code4{
        public static void main(String[] arg){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter size of Array: ");
                int size=sc.nextInt();
                int temp=0;

                int  arr[]=new int [size];
                int  arr1[]=new int [size];
                System.out.println(" Array 1: ");
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
                        arr[k]=sc.nextInt();
                        System.out.println();
                }
                System.out.println(" Array 2: ");
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
                        arr1[k]=sc.nextInt();
                        System.out.println();
                }
                System.out.print("common elements in array : ");
                for(int k=0;k<size;k++){
			for(int j=0;j<size;j++){
                        if(arr[k]==arr1[j]){
				System.out.print(arr[k]+ " ");
                        
               }
		}
		}
		}
}

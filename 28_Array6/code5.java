import java.util.*;
class Code5{
        public static void main(String[] arg){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter size of Array 1: ");
                int size=sc.nextInt();
                int temp=0;

                int  arr[]=new int [size];
                System.out.print("Enter size of Array 2: ");
                int size2=sc.nextInt();
                int  arr1[]=new int [size2];
		int size3=size+size2;
		int arr3 []=new int [size3];
                System.out.println("Array 1: ");
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
                        arr[k]=sc.nextInt();
			arr3[k]=arr[k];
                        System.out.println();
			
                }
                System.out.println("Array 2: ");
		int index=size;
                for(int k=0;k<size2;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
                        arr1[k]=sc.nextInt();
			arr3[index]=arr1[k];
                        System.out.println();
			index++;
                }
                System.out.println("Merged Array : ");
                for(int k=0;k<size3;k++){
				System.out.print(arr3[k]+ " ");
                        
               }
		}
}
		

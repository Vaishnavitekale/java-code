import java.util.*;
class Code8{
        public static void main(String[] arg){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter size of Array: ");
                int size=sc.nextInt();
		char temp=0;
               char arr[]=new char [size];
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
			
                        arr[k]=sc.next().charAt(0);
                        
                }
                System.out.println( "before reverse");
		for(int k=0;k<size;k++){
                        System.out.print(arr[k]+ " ");
			}
                System.out.println();
		for(int k=0;k<size;k++){
			if(k%2==1){
                        System.out.print(arr[k]+ " ");
			}
		}
                System.out.println();
                System.out.println( "after reverse");
		for(int k=0;k<size/2;k++){
			temp=arr[k];
			arr[k]=arr[size-(k+1)];
			arr[size-(k+1)]=temp;
			}
		for(int k=0;k<size;k++){
                        System.out.print(arr[k]+ " ");
			}
                System.out.println();
		for(int k=0;k<size;k++){
			if(k%2==1){
                        System.out.print(arr[k]+ " ");
			
			}}
                System.out.println();
	}
	}



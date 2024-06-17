import java.util.*;
class Code9{
        public static void main(String[] arg){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter size of Array: ");
                int size=sc.nextInt();
                int arr[]=new int [size];
		int count=0;
		int num2=0;
		int num=0;
		int num1=0;
                for(int k=0;k<size;k++){
                        System.out.print("Enter Element "+(k+1)+" : ");
                        arr[k]=sc.nextInt();
                        
                }
		for(int i=0;i<size;i++){
		 num2=0;
		 num=0;
			num1=arr[i];
			while(num1!=0){
			num=num1%10;
			
			num2=num2*10+num;
			num1=num1/10;
			
			}
			if(num2==arr[i]){
				count++;
			}
		}
                System.out.println("count of palindrome is: "+count);
	}
}


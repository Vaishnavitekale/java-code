import java.util.*;
class code1{
	public static void main(String [] arg){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no. of rows: ");
	int row=sc.nextInt();
	for(int i=1;i<=row;i++){
	int ch=64+row;
		for(int j=1;j<=row;j++){
			if(i%2==1){
			System.out.print((char)ch+" ");
			ch--;}
			else{
			System.out.print(row+ " ");
			}

		}
		System.out.println();
	}
	}
}


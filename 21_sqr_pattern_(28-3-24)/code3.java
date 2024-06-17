import java.util.*;
class Code3{
	public static void main(String [] arg){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no. of rows: ");
	int row=sc.nextInt();
	int num=row;
	for(int i=1;i<=row;i++){
		for(int j=1;j<=row;j++){
			if(num%row==0){
			System.out.print(num*num+"     ");
			}
			else{
				System.out.print(num+"    ");
			}
			num++;


		}
		System.out.println();
	}
	}
}


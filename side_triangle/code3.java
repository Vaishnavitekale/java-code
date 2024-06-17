import java.util.*;
class Code3{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int col=0;
		int num=0;
		for(int i=1;i<row*2;i++){
			if(i>=row){
				col=row*2-i;
				num=col;
			}
			else{
				col=i;
				num=col;
				
			}
			for(int j=1;j<=col;j++){
				System.out.print(num-- +"\t");
			}
		
				System.out.println();
		}
	}
}

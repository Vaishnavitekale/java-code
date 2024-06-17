import java.util.*;
class Code5{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int col=0;
		int num=64+row+1;
		for(int i=1;i<row*2;i++){
			if(i>=row){
				col=row*2-i;
				num=(64+row+1)-col;
			}
			else{
				col=i;
				num--;
				
			}
			for(int j=1;j<=col;j++){
				System.out.print((char)num +"\t");
			}
		
				System.out.println();
		}
	}
}

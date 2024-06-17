import java.util.*;
class Code8{
	public static void main(String[]  arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num=row;
		for(int i=0;i<row;i++){
		int ch=row+64;
			for(int j=0;j<row;j++){
				if(num%2==0){
					System.out.print("#"+" ");
				}
				else{
					System.out.print((char)ch-- +" ");
				}
				num++;
				
			
			}
					System.out.println();
		}
	}
}

			

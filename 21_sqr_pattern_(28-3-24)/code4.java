import java.util.*;
class Code4{
	public static void main(String[]  arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int ch=64+row;
		int num=row;
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				if(j==0){
					System.out.print((char)ch+"  ");
				}
				else{
					System.out.print(num+"	 ");
				}
				num++;
				ch++;
			}
					System.out.println();
		}
	}
}

			

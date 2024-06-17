import java.util.*;
class code8{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		for (int i=1;i<=row;i++){
			int ch=row+1-i;
			
			int ch2=row+65-i;
			for(int j=row;j>=i;j--){
				if(i%2==1){
					System.out.print(ch +" ");

				}
				else{
					System.out.print((char)ch2 +" ");
				}
				ch--;
				ch2--;

			}
			
				System.out.println();
		}
	}
}


import java.util.*;
class code7{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		for (int i=1;i<=row;i++){
			int ch=row+97-i;
			
			int ch2=(row+1)-i;
			for(int j=row;j>=i;j--){
				if(j%2==0){
					System.out.print(ch2 +" ");

				}
				else{
					System.out.print((char)ch +" ");
				}
				ch--;
				ch2--;

			}
			
				System.out.println();
		}
	}
}


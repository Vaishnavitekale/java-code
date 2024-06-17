import java.util.*;
class code6{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		for (int i=1;i<=row;i++){
			int ch=1;
			char ch2='a';
			for(int j=row;j>=i;j--){
				if(j%2==0){
					System.out.print(ch++ +" ");
				}
				else{
					System.out.print(ch2++ +" ");
				}

			}
		
				System.out.println();
		}
	}
}


import java.util.*;
class code5{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		for (int i=1;i<=row;i++){
			char ch='A';
			char ch2='a';
			for(int j=row;j>=i;j--){
				if(i%2==1){
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


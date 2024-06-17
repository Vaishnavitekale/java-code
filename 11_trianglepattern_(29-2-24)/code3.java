import java.io.*;
class code3{
	public static void  main(String [] arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("eneter row: ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=row;
			for(int j=1;j<=i;j++){
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
	}
}


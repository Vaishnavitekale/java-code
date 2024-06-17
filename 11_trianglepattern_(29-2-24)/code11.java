import java.io.*;
class code11{
	public static void main(String[] arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
				int ch=64+i;
				for(int j=row;j>=i;j--){
					if(j%2==1){
					System.out.print((char)ch++ +" ");
				}
				else{
					System.out.print(ch++ +" ");
				}
				}

			
		System.out.println();
		}
	}
}

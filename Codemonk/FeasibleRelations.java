import java.io.*;

class FeasibleRelations

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		byte T=Byte.parseByte(xx.readLine());
		int N,K;
		int a[][]; int b[];
		for(byte i=1;i<=T;i++)

		{
			String s[]=xx.readLine().split(" ");
			N=Integer.parseInt(s[0]);
			K=Integer.parseInt(s[1]);
			a=new int[K][2];String ss[]=new String[K];
			b=new int[N];

			for(int j=0;j<K;j++)
			{
				s=xx.readLine().split(" ");
				a[j][0]=Integer.parseInt(s[0]);
				a[j][1]=Integer.parseInt(s[2]);
				ss[j]=s[1];

			}
			for(int j=0;j<K;j++)
			{
				if(ss[j].equals("="))
					b[a[j][0]-1]=b[a[j][1]-1]=10;

			}
			boolean flag=true;
			for(int j=0;j<K;j++,flag=true)
			{
				if(ss[j].equals("!="))
				{
					if(b[a[j][0]-1]==b[a[j][1]-1])
					{
						flag=false;
						break;
					}

				}

			}

			if(flag)
			System.out.println("YES");
			else
			System.out.println("NO");

		}

	}


}






import java.io.*;

class Q1

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(xx.readLine());
		int n; // no of friends
		int N; //no. of friends of the i'th friend
		String output="";
		int temp;
		boolean flag[];
		boolean f2;
		int count;
		int i,j;
		String s[];
		while(t-->0)
		{

			n=Integer.parseInt(xx.readLine());

			int Ni[][]=new int[n][];
			int len[]=new int[n];

			for(i=0;i<n;i++)
			{
				len[i]=Integer.parseInt(xx.readLine());

				Ni[i]=new int[len[i]];

				s=(xx.readLine()).split(" ");

				for(j=0;j<len[i];j++)
					Ni[i][j]=Integer.parseInt(s[j]);


			}

			flag=new boolean[n];

			for(i=0,count=0;i<len[0];i++)
			{
				temp=Ni[0][i];

				for(int m=0;m<n;m++)
				flag[m]=false;

				for(int l=1;l<=(n-1);l++)
				{

					for(j=0;j<len[l];j++)
					{
						if(temp==Ni[l][j])
						{
							flag[l]=true;
							break;
						}

					}

				}

				for(j=1,f2=true;j<n;j++)
				{
					if(flag[j]==false)
					{
						f2=false;
						break;
					}

				}

				if(f2)
				{
					count++;
					output=output+temp+" ";
				}

			}

			if(count==0)
			output=output+"NONE"+"\n";
			else
			output=output+"\n";

		}

		System.out.println(output);

	}

}












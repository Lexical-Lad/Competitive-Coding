import java.io.*;

class Q2
{

static long fact(int n)
{
	if(n==0||n==1) return 1;

	long out=1;

	for(int i=1;i<=n;i++)
	out*=i;

	return out;
}

public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(xx.readLine());
		int n;
		int a, b,c;

		int steps;

		String output="";
		long count;
		long lol;
		int q,w;

		while(t-->0)
		{
			count=0;

			n=Integer.parseInt(xx.readLine());

			steps=n/2 +1;

			a=b=n;
			c=0;
			for(int i=1;i<=steps;i++)
			{
				lol=1;


				if(b>=c)
				{
					q=b;
					w=c;
				}

				else
				{

					q=c;
					w=b;
				}

				for(int j=a;j>q;j--)
				lol*=j;

				count=count + (lol/Q2.fact(w));

				a--;
				b-=2;
				c++;
			}
			output=output+count+"\n";
		}

		System.out.println(output);

	}
}









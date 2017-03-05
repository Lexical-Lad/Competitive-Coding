import java.io.*;

class CrazyFunction

{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(xx.readLine());

		final int m=1000000007;

		String output="";
		int a,b;

		int fun1=1;

		int fun2=0;

		while(t-->0)
		{
			fun1=1;

			String s[]=(xx.readLine()).split(" ");

			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);

			for(int i=a;i<=b;i++,fun2=0)
			{

				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					fun2=((fun2%m)+(((int)(Math.pow(j,i)))%m))%m;

				}

				fun1=((fun1%m)*(fun2%m))%m;

			}

			output=output+fun1+"\n";

		}

		System.out.println(output);

	}

}





import java.io.*;

class ColorfulBalls

{
	static int count=0;

	static int fact(int n)
	{
		if(n==0)return 1;

		for(int i=1;i<n;i++)
		n*=i;

		return n;
	}

	static void balls(int a,int b,int c,int d)
	{
		if(a==0&&b==0&&c==0&&d==0)
		ColorfulBalls.count++;



		if(a!=0)
		ColorfulBalls.balls(--a,b,c,d);

		if(b!=0)
		ColorfulBalls.balls(a,--b,c,d);

		if(c!=0)
		ColorfulBalls.balls(a,b,--c,d);

		if(d!=0)
		ColorfulBalls.balls(a,b,c,--d);
	}



	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		String s[]=xx.readLine().split(" ");

		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		int c=Integer.parseInt(s[2]);
		int d=Integer.parseInt(s[3]);


		ColorfulBalls.balls(a,b,c,d);

		System.out.println(count/2);

	}

}


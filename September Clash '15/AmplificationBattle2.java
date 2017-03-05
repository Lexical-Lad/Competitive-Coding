import java.io.*;

class AmplificationBattle2

{	long a,b,c;

	 int f(long x,int m)

	 {	long temp=x*a;
		for(long i=x*b;i>=temp;i--)
			if(i<c)return f(i,m+1);

			return m;
	 }

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		short T=Short.parseShort(xx.readLine());

		AmplificationBattle2 z=new AmplificationBattle2();

		String s[]=new String[T];


		for(short t=0;t<T;t++)
			s[t]=xx.readLine();

		for(short t=0;t<T;t++)
		{
			String ss[]=s[t].split(" ");

			z.a=Long.parseLong(ss[0]);
			z.b=Long.parseLong(ss[1]);

			z.c=Long.parseLong(ss[2]);



			if(z.f(1,1)%2==0)System.out.println("Bob");
			else System.out.println("Adam");

		}
	}

}







import java.io.*;

class AmplificationBattle

{	long a,b,c;
	long mm=0;//mm stores the currently lowest number(>=c)
	int l=0;//stores the level at which mm resides(levels start at 1)

	boolean f(long x,int m)
	{
		if(x>=c)
		{	if(mm==0)
			{
				mm=x;
				l=m;
			}

			else if(x==mm)
			{
				if(m<l)
				l=m;
			}
			else if(x<mm)
			{
				mm=x;
				l=m;
			}


			return true;
		}

		long lb=a*x;
		long ub=b*x;
		for(long i=lb;i<=ub;i++)
		{
			if(f(i,m+1))break;
		}
		return false;



	}



	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		short T=Short.parseShort(xx.readLine());

		String out="";

		AmplificationBattle z=new AmplificationBattle();

		String s[]=new String[T];


		for(short t=0;t<T;t++)
			s[t]=xx.readLine();

		for(short t=0;t<T;t++,z.mm=0,z.l=0)
		{
			String ss[]=s[t].split(" ");

			z.a=Long.parseLong(ss[0]);
			z.b=Long.parseLong(ss[1]);

			z.c=Long.parseLong(ss[2]);

			if(z.b>=z.c)
			{
				out =out+ "Adam \n";
				continue;
			}

			z.f(1,1);

			if(z.l%2==0)out=out + "Adam\n";
			else out =out+ "Bob\n";

		}

		System.out.println(out);
	}

}







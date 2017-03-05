import java.io.*;  //single program

class Relay

{

	static boolean checkprime(int n)
	{
		if(n%2==0)
				return false;
				if(n==2) return true;
				if(n==3) return true;
				if(n==1)return false;

				int y=(int)Math.sqrt(n);

				for(int i=3;i<=y;i+=2)
				{
					if(n%i==0)
					return false;
				}

				return true;

	}


static	int nthprime(int n)
	{
		if(n==1) return 2;
		if(n==2) return 3;

		int count=2;

		for(int i=5;;i++)
		{
			if(Relay.checkprime(i))
			count++;

			if(count==n)
			return i;
		}
	}




	public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			int n=Integer.parseInt(xx.readLine());
			int num[]=new int[n];

			String s[]=(xx.readLine()).split(" ");


			for(int i=0;i<n;i++)
				num[i]=Integer.parseInt(s[i]);

			for(int i=0;i<n;i++)
				num[i]=Relay.nthprime(num[i]);


			String p;

			int count;

			for(int i=0;i<n;i++)
			{
				count=0;
				p=Integer.toBinaryString(num[i]);

				for(int j=0;j<p.length();j++)
				{
					if(p.charAt(j)=='1')
					count++;
				}

				num[i]=count;
			}

			boolean f=true;

			int largest=num[0];

			for(int i=0;i<n;i++)
			{
				if(num[i]>largest)
					largest=num[i];

			}

			int gcd=1;

			for(int i=2;i<=largest;i++)
			{
				f=true;

				for(int j=0;j<n;j++)
				{
					if(num[j]%i!=0)
					{
						f=false;
						break;
					}

				}

				if(f)
				gcd=i;

			}


			System.out.println(gcd);

		}

	}













import java.io.*; // 1 is not considered prime

class Q3

{

	static int currentHighest(String s)
	{
		boolean f=true;

		for(int i=9;i>=1;i--,f=true)
		{
			for(int j=0;j<s.length();j++)
			{
				if((s.charAt(j)-48)==i)
				{
					f=false;
					break;
				}
			}
			if(f)
			return i;

		}

		return 0;
	}



	static boolean prime(int n)
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


	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(xx.readLine());

		String s;int n;
		String output="";
		int ha=9;
		int cur;
		int ci;
		int ni;
		String num[];
		boolean flag[];
		boolean f;
		int c;




		while(t-->0)
		{
			s="";

			n=Integer.parseInt(xx.readLine());

			flag=new boolean[n];

			num=(xx.readLine()).split(" ");

			for(int i=0;i<n;i++)
				flag[i]=Q3.prime(Integer.parseInt(num[i]));


			cur=9;

			c=-1;

			while(flag[++c])
			cur-=1;

			s=s+cur; //first digit obtained

			ci=0; //current index=0

			ha=Q3.currentHighest(s);

			while(s.length()<(n+1))
			{
				if(ci<(n-1))

				{
					if(flag[ci]==true)
					{
						ci++;
						cur++;
						s=s+cur;
						ha=Q3.currentHighest(s);


					}
					else if(flag[ci]==false && flag[ci+1]!=true)
					{
						ci++;
						cur=ha;
						s=s+cur;
						ha=Q3.currentHighest(s);


					}

					else if(flag[ci]==false && flag[ci+1]==true)
					{

						int r=0;


						for(int p=ci+1;p<n && flag[p]!=false;p++)
						r++;

						cur=ha-r;

						s=s+cur;
						ci++;

						ha=cur;//ha=Q3.currentHighest(s);


					}
				}

				else
				{
					if(flag[ci]==true)
					{
						cur=Q3.currentHighest(s);
						s=s+cur;
					}
					else
					{
						cur=Q3.currentHighest(s);
						s=s+cur;
					}
				}

			}

			output=output+s+"\n";

		}

		System.out.println(output);
	}

}

















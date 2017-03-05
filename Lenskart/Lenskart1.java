import java.io.*;

class Lenskart1

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		final int mod=1000000007;
		final double log2=Math.log(2);

		int k=Integer.parseInt(xx.readLine());

		int A[]=new int[k];

		String s[]=xx.readLine().split(" ");

		for(int i=0;i<k;i++)
		A[i]=Integer.parseInt(s[i])%mod;

		String out="";
		int temp;

		int q=Integer.parseInt(xx.readLine());


		int S[]=new int[100000];

		S[0]=1;
		S[1]=3;

		int check1=2;
		int check2=4;


		for(int i=2;i<100000;i++)
		{
			if(i==check2)
			{
				check1=check2;
				check2=check2*2;
			}

			temp=i%check1;

			S[i]=(S[temp]%mod+A[i%k]%mod)%mod;
		}

		for(int i=0;i<q;i++)
			out=out+S[Integer.parseInt(xx.readLine())] + "\n";


		/*for(int i=0;i<q;i++)
		{
			temp=Integer.parseInt(xx.readLine());

			if(temp==0)
				out=out+"1"+"\n";
			else if(temp==1)
				out=out+"3"+"\n";
			else
				out=out+((A[(temp%k)]+A[((temp-((int)Math.pow(2,((int)(Math.log(temp)/log2)))))%k)]+1)%mod)+"\n";

		}*/

		System.out.println(out);



	}

}


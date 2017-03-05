import java.io.*;

class Sabre1

{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		 String hash[]=new String[100000];

		String temp[];
		int a,b;

		int N=Integer.parseInt(xx.readLine());
		int k=Integer.parseInt(xx.readLine());


		for(int i=0;i<k;i++)
		{
			temp=xx.readLine().split(" ");

			a=Integer.parseInt(temp[0]);
			b=Integer.parseInt(temp[1]);

			if(hash[a]!=null)
				hash[a]=(" "+temp[1]);
			else
				hash[a]=temp[1];

			if(hash[b]!=null)
				hash[b]=(" " + temp[0]);
			else
				hash[b]=temp[0];

		}


		int x=Integer.parseInt(xx.readLine());

		String check[]=hash[x].split(" ");

		int l=check.length;

		for(int i=0;i<l;i++)
		{


			if(!(hash[Integer.parseInt(check[i])].split(" ").length>1))
			{
				System.out.println("Not Connected");
				System.exit(0);
			}

		}

		System.out.println("Connected");
	}

}



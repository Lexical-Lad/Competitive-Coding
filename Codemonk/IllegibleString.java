import java.io.*;

class IllegibleString

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(xx.readLine());
		int min=0,max=0;int i;
		String s=xx.readLine();
		String ss="";
		char c;
		for(i=0;i<n;i++)
		{ 	max++;
			c=s.charAt(i);
			if(c=='w')
			{
				max++;
				ss=ss+"vv";
			}
			else
			ss=ss+c;
		}
		n=ss.length()-1;
		for(i=0;i<n;i++)
		{ 	min++;

			if(ss.charAt(i)=='v' && ss.charAt(i+1)=='v')
				i++;
		}
		if(i==n)min++;

		System.out.println(min + " " + max);

	}

}




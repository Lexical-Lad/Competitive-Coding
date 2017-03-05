import java.io.*;

class KthSequence
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(xx.readLine());

		String output="";
		int n,k;
		String s[];

		while(T--!=0)
		{
			s=xx.readLine().split(" ");
			n=Integer.parseInt(s[0]);
			k=Integer.parseInt(s[1]);




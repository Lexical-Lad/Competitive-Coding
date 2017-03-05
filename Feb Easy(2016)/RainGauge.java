import java.io.*;

class RainGauge

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(xx.readLine());

		String s[];
		int r,n;
		double a;
		double ans=1;

		for(int i=0;i<T;i++)
		{
			s=(xx.readLine()).split(" ");

			n=Integer.parseInt(s[0]);
			r=Integer.parseInt(s[1]);


			ans*=1.5 *n*(n+1)/r/(2*n+1);

		}

		System.out.printf("%.4f",ans);
		//System.out.println(Integer.toString((int)ans)+ "." + Integer.toString((int)((ans-((int)ans))*10000)));
	}

}













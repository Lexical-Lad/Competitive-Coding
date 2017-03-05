import java.io.*;

class ProductSquare
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int n1=0,nps=0,temp;
		double prob=0;
		int hash[]=new int[5001];
		double temp2;


		int T=Integer.parseInt(xx.readLine());
		double tr=1.0/T;
		while(T--!=0)
		{
			temp=Integer.parseInt(xx.readLine());

			hash[temp]++;

			if(temp==1)
			{
				n1++;
				continue;
			}

			temp2=Math.sqrt(temp);
			if(Math.ceil(temp2)==temp2)
			{
				if(hash[temp]==0)nps++; //counts the no. of distinct perfect squares
			}
		}

		for(int i=1;i<=5000;i++)
		{
			if(hash[i]<=1)continue;
			prob=prob+(hash[i]*tr*(hash[i]-1)*(tr-1));
		}

		prob=prob + ((((double)nps)*(nps-1)/2)/T);

		prob=prob + (((double)n1)*(n1-1)/2)/T + n1*nps;

		System.out.printf("%.6f",prob);

	}
}


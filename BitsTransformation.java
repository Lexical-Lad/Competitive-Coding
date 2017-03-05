//www.hackerearth.com/problem/algorithm/bits-transformation-1/

import java.io.*;
import java.util.StringTokenizer;


class BitsTransformation

{
	public static void main(String args[])throws IOException
	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
		int T;
		StringTokenizer st;
		String A,B;
		char temp;
		int tt,tl,tr;

		T=Integer.parseInt(xx.readLine());

		for(int i=0;i<T;i++)
		{

			st=new StringTokenizer(xx.readLine());

			int N=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int z=Integer.parseInt(st.nextToken());
			int t=Integer.parseInt(st.nextToken());

			 A=xx.readLine();
			 B=xx.readLine();
			 int check[]=new int[N+2];  // to circumvent provisions for IndexOutOfBoundsException
			 int cost=0;

			 boolean tx=(t<x);
			 boolean ty=(t<y);
			 boolean txpy=(t>(x+y));

			 for(int j=0;j<N;j++)
			 {
				 if((temp=A.charAt(j))==B.charAt(j))
				 check[j+1]=1;
				 else
				 {
					 if(temp=='0')
					 check[j+1]=2;
					 else if(temp=='1')
					 check[j+1]=3;
					 else
					 check[j+1]=4;
				 }

			 }
			 check[0]=check[N+1]=1;


			 //check

			 //for(int j=1;j<=N;j++)
				//System.out.println(check[j]);

			 for(int j=1;j<=N;j++) // skip over question marks in this pass
			 {

				 if((tt=check[j])==1)  //match
				 continue;

				 //mismatch cases

				tl=check[j-1];
				tr=check[j+1];

				if(tr==1 || txpy)  //the right neighbor is a match, so can't be touched
				{
					cost+=(tt==2?x:(tt==3?y:z));
					check[j]=1;
					continue;
				}

				//by now, the right neighbor is a mismatch and t<(x+y)

				switch(tt)
				{

					case 2:
							if(tr==2)
							{
								check[j]=1;
								cost+=x;
							}
							else if(tr==3)
							{
								cost+=t;
								check[j]=1;
								check[j+1]=1;
							}
							else
							{
								if(tx)
								{
									check[j]=1;
									check[j+1]=1;
									cost+=z+t;
								}
								else
								{
									check[j]=1;
									cost+=x;
								}
							}
							break;

					case 3:
							if(tr==3)
							{
								check[j]=1;
								cost+=y;
							}
							else if(tr==2)
							{
								check[j]=1;
								check[j+1]=1;
								cost+=t;
							}
							else
							{
								if(ty)
								{
									cost+=z+t;
									check[j]=1;
									check[j+1]=1;
								}
								else
								{
									cost+=y;
									check[j]=1;
								}

							}
							break;

					case 4:
							if(tr==2)
							{

								if(tx)
								{
									cost+=z+t;
									check[j]=1;
									check[j+1]=1;
								}
								else
								{
									cost+=z;
									check[j]=1;
								}

							}
							else if(tr==3)
							{
								if(ty)
								{
									cost+=z+t;
									check[j]=1;
									check[j+1]=1;
								}
								else
								{
									cost+=z;
									check[j]=1;
								}
							}

							break;
				}

			}

			for(int j=1;j<=N;j++)
			{
				if(check[j]==4)
				{
					cost+=z;
					check[j]=1;
				}
			}


			System.out.println(cost);

		}
	}

}




/*Alice has just learnt multiplying two integers. He wants to multiply two integers X and Y to form a number Z. To make the problem interesting he will choose X in the range [1,M] and Y in the range [1,N]. Help him to find the number of ways in which he can do this.

Input
First line of the input is the number of test cases T. It is followed by T lines. Each line has three space separated integers, the numbers Z, M and N.

Output
For each test case output a single integer, the number of ways.

Constraints
1 <= T <= 50
1 <= Z <= 10^12
1 <= M <= 10^12
1 <= N <= 10^12
Sample Input
(Plaintext Link)

4
4 7 9
5 2 10
5 5 6
2 8 1

Sample Output
(Plaintext Link)

3
1
2
1

Time Limit: 3 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
*/


import java.io.*;

class FindingNumbers

{
	public static void main(String args[])throws IOException

	{
		long z,m,n,n1,n2;
		String out="";
		long count=0l;long sqrt;

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		byte T=Byte.parseByte(xx.readLine());

		for(int i=0;i<T;i++,count=0l)
		{

			String s[]=(xx.readLine()).split(" ");

			z=Long.parseLong(s[0]);
			m=Long.parseLong(s[1]);
			n=Long.parseLong(s[2]);

			sqrt=(long)Math.sqrt(z);

			for(n1=1;n1<=sqrt;n1++)
			{
				n2=z/n1;

				if(n2*n1==z)
				{
					if(n2<=m)
					count++;

					if(n2<=n && n2!=n1)
					count++;
				}
			}

			out=out+count+"\n";

		}

		System.out.println(out);
	}

}










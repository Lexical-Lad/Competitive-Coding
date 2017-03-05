import java.io.*;

class OzStrings
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(xx.readLine());

		int count;
		int length;
		int flength;
		String output="";


		while(T--!=0)
		{
			count=flength=0;
			String str=xx.readLine();
		 	length=str.length();

			while(length>0)
			{
				while(length!=0 && str.charAt(0)!='R')
				{
					str=str.substring(1);
					length--;
				}



				while(length!=0 && str.charAt(length-1)!='K' )
				{
					str=str.substring(0,length-1);
					length--;
				}

				if(length >0)
				{
					str=str.substring(1,length-1);
					flength+=2;
					length-=2;
				}
			}
			output=output+flength+"\n";

		}

		System.out.println(output);

	}

}

package silver;

import java.io.*;
import java.util.*;

public class AB {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int count=1;
		while(A!=B)
		{
			if(B<A)
			{
				System.out.println("-1");
				System.exit(0);
			}
			if(B%10==1)B/= 10;
			else if (B%2==0) B/=2;
			else {System.out.println("-1"); System.exit(0);}
			count++;
			
		}
		System.out.println(count);
	}
}

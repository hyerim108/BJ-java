import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 엄청난부자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		System.out.println(n.divide(m)+ "\n" + n.remainder(m));
	}

}

//Please write code which taken input date in / format and print in comma format, needs code in java langauge
package lab;
import java.util.*;
public class tokens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter the date in format dd/mm/yyyy");
		name=sc.next();
		StringTokenizer st = new StringTokenizer(name,"/");
		int count=st.countTokens();
		for(int i=1;i<=count&&st.hasMoreTokens();i++)
		{
			System.out.print(st.nextToken());
			if(i<count)
				System.out.print(",");
		}
	}
}

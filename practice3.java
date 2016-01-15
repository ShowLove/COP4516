import java.util.Arrays;

public class practice3
{
	public static void main( String args[] )
	{
		char[] word = new char[6];
		String str = "hello";
		word = str.toCharArray();

		System.out.println(word);
		byte var = (byte) (word[0] + 1);
		word[0] = (char) var;
		System.out.println(word);
	}

	public static void func()
	{

	}
}
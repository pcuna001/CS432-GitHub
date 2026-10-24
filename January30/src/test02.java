
public class test02 {
	public static void main(String[] args)
	{
		int a = 5;
		double b = 3.5;
		int c = 33;
		float d = 0.5f;
		short e = 22;
		int x = 50;
		
		System.out.println(a += 4 % 2 + e);
		System.out.println(b /= 10 * 2);
		System.out.println(c %= e * 2 + 1);
		System.out.println(d %= 2 + 6 % 7);
		System.out.println(x += 100 % 5 + 10 * 2);
	}
}

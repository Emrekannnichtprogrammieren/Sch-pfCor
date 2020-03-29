package cor;


public class RekFormel {

	public static int f(int x)	{	
		if(x == 1)	{
			return 1;
		}
		
		return f(x-1)+2*x-1;
	}

	
	public static void main(String[] args) {
		System.out.println(f(5));
	}
}

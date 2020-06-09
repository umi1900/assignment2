class Test
{
	public int add(int x, int y)
	{
		return x+y;
    }

    public int add(int x, int y, int z)
    {
    	return x+y+z;
    }


}

	public class staticPoly
	{
    	public static void main(String[] args)
    	{
			Test testing = new Test();

    		System.out.println(testing.add(5,10));

    		System.out.println(testing.add(5,10,15));

   		 }
	}
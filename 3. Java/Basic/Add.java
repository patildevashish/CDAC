class Addition
{
	int a = 10;
	static int b = 10;
	
	void show()
	{
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String ar[])
	{
		Addition d1=new Addition();
		Addition d2=new Addition();
		Addition d3=new Addition();

		d1.show();
		d2.show();
		d3.show();
	}
}
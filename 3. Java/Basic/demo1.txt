 class Demo1{
	static public void main(String a[]){
		String name = a[0];
		int age = Integer.parseInt ( a[1]);
		double salary = Double.parseDouble (a[2]);

		System.out.println("Name : "+name);
		System.out.println("Age : "+age*2);
		System.out.println("salary : "+salary);
	}
}
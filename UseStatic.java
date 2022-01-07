class UseStatic{
	static int a = 3;
	static int b;

	static void meth(int x){
		System.out.println("X = "+x);
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}

	public static void main(String args[]){
		meth(42);
	}
	static {
		System.out.println("Static block initialized");
		b=a*4;
	}
}

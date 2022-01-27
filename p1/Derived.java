package p1;
//Accessing members in superclass in the same package
class Derived extends Protection{
	Derived() {
		// TODO Auto-generated constructor stub
		System.out.println("Derived Constructor");
		System.out.println("n ="+n);
		System.out.println("n_pri = "+n_pri);
		System.out.println("n_pro = "+n_pro);
		System.out.println("n_pub = "+n_pub);
	}
}
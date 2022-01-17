//Dynamic method Dispatch
class A{
	void callMe(){
		System.out.println("Inside A's callme method");
	}
}

class B extends A{
	void callMe(){
		System.out.println("Inside B's callme method");
	}
}

class C extends A{
	void callMe(){
		System.out.println("Inside C's callme method");
	}
}

class Dispatch{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		C c = new C();

		A r;//obtain a reference of type A

		r=a;
		r.callMe();// calls A's version of callme

		r=b;
		r.callMe();// calls B's version of callme

		r=c;
		r.callMe();// calls C's version of callme
	}
}

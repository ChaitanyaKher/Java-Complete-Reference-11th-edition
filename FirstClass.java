class MyFirstClass{
	int i;
	String j;
	
	MyFirstClass(){
		this.i=0;
		this.j="Default String";
	}

	MyFirstClass(int i){
		this.i=i;
		this.j="Default String";
	}

	MyFirstClass(String j){
		this.i=0;
		this.j=j;
	}

	MyFirstClass(int i, String j){
		this.i=i;
		this.j=j;
	}

	String getj(){
		return j;
	}

	int geti(){
		return i;
	}
}


class FirstClass{
	public static void main(String args[]){
		MyFirstClass a = new MyFirstClass(6,"ASD");
		System.out.println(a.getClass());
		System.out.println(a.getj().hashCode());
		System.out.println(a.getj().toString());
	}
}

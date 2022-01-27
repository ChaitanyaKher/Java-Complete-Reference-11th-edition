//a simple package
package mypack;

class Balance{
	String name;
	double bal;

	Balance(String n, double b){
		name =n;
		bal=b;
	}

	void show(){
		if(bal<0){
			System.out.println("--> ");
		}
		System.out.println(name+": $"+bal);
	}
}

class AccountBalance{
	public static void main(String args[]){
		Balance current[]=new Balance[3];

		current[0]= new Balance("Chaitanya",100.21);
		current[1]= new Balance("Rohan",233.53);
		current[2]= new Balance("Aditi",3245.65);

		for(int i=0;i<3;i++) current[i].show();
	}
}

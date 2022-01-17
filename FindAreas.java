//Using run-time polymorphism
class Figure{
	double dim1;
	double dim2;
	String fig;

	Figure(double a, double b){
		dim1=a;
		dim2=b;
	}

	double area(){
		fig="Figure";
		System.out.println("Area for the "+fig+" is undefined.");
		return 0;
	}
}

class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}

	//override area for rectangle
	double area(){
		fig="Rectangle";
		System.out.println("Inside area of "+fig+".");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}

	//override area for triangle
	double area(){
		fig = "Triangle";
		System.out.println("Inside area of "+fig+".");
		return dim1*dim2/2;
	}
}

class FindAreas{
	public static void main(String args[]){
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);

		Figure figref;

		figref = r;
		System.out.println("Area is "+figref.area());

		figref = f;
		System.out.println("Area is "+figref.area());

		figref = t;
		System.out.println("Area is "+figref.area());
	}
}

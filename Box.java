class Box{
	double width;
	double height;
	double depth;

	//Constructor
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth =depth;
	}

	double volume(){
		return width*height*depth;
	}
}

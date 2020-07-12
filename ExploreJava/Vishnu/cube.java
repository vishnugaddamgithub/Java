package Vishnu;

public class cube {
	int length;
	int breadth;
	int height;
 public int getcudevolume() {
	 return(length*breadth*height);
	 
	 
 }
 
 public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getBreadth() {
	return breadth;
}

public void setBreadth(int breadth) {
	this.breadth = breadth;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

cube(){
	 //System.out.println("we are in constructor");
	 length = 20;
	 breadth = 30;
	 height =50;
 }
 cube(int l,int b,int h){
	 //System.out.println("we are in constructor");
	 length = l;
	 breadth = b;
	 height = h;
 }
 
}

abstract class shape {
double a,b;

shape(int x, int y)
{
  a=x;
  b=y;
}

abstract void printArea();
}
class rectangle extends shape{
rectangle(int x, int y)
{
super(x,y);
}
void printArea()
{
  System.out.println("Area of rectangle is " +(a*b));
}
}

class triangle extends shape{
triangle(int x, int y)
{
super(x,y);
}
void printArea()
{
  System.out.println("Area of triangle is " +(0.5*a*b));
}
}

class circle extends shape{
circle(int x, int y)
{
super(x,y);
}
void printArea()
{
  System.out.println("Area of circle is " +(3.14*a*a));
}
}

class shapearea{
public static void main(String args[])
{
 rectangle r1= new rectangle(10,20);
 triangle t1= new triangle(5,10);
 circle c1= new circle(3,0);

  shape r;
  r=r1;
  r.printArea();
r=t1;
  r.printArea();
r=c1;
  r.printArea();
}
}

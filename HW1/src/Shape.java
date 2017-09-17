public abstract class Shape 
{
	abstract void sides();
	}
class Trapezoid extends Shape
{
	void sides()
	{
		System.out.println("The number of sides in Trapezoid: 4");
	}
}
class Triangle extends Shape
{
	void sides()
	{
		System.out.println("The number of sides in Triangle: 3");
	}	
}
class Hexagon extends Shape
{
	void sides()
	{
		System.out.println("The number of sides in Hexagon: 6");
	}
}
class Main
{
	public static void main(String []args)
	{
		Shape H=new Hexagon();
		H.sides();
		Shape T=new Triangle();
		T.sides();
		Shape Tr=new Trapezoid();
		Tr.sides();
	}
}

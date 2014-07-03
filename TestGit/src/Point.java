

public class Point 
{
	private int my_x;
	private int my_y;
	
	public Point()
	{
		this(0, 0);
	}
	
	public Point(final int the_x, final int the_y)
	{
		my_x = the_x;
		my_y = the_y;
	}
	
	public int getX()
	{
		return my_x;
	}
	
	public int getY()
	{
		return my_y;
	}
	
	public void setX(final int the_x)
	{
		my_x = the_x;
	}
	
	public void setY(final int the_y)
	{
		my_y = the_y;
	}
	
	public String toString()
	{
		final StringBuilder str = new StringBuilder();
		
		str.append("(").append(my_x).append(", ");
		str.append(my_y).append(")");
		
		return str.toString();
	}

}

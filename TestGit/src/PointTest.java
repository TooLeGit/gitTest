import static org.junit.Assert.*;

import org.junit.Test;


public class PointTest 
{
	Point p1;
	@Test
	public void testPoint() 
	{
		p1 = new Point();
		assertNotNull(p1);
		assertEquals(p1.getX(), 0);
		assertEquals(p1.getY(), 0);
	}

	@Test
	public void testPointIntInt()
	{
		p1 = new Point(1, 1);
		assertNotNull(p1);
		assertEquals(p1.getX(), 1);
		assertEquals(p1.getY(), 1);
	}

	@Test
	public void testGetX() 
	{
		p1 = new Point();
		assertEquals(p1.getX(), 0);
	}

	@Test
	public void testGetY() 
	{
		p1 = new Point();
		assertEquals(p1.getY(), 0);
	}

	@Test
	public void testSetX() 
	{
		p1 = new Point();
		assertEquals(p1.getX(), 0);
		p1.setX(10);
		assertEquals(p1.getX(), 10);
	}

	@Test
	public void testSetY() 
	{
		p1 = new Point();
		assertEquals(p1.getY(), 0);
		p1.setY(10);
		assertEquals(p1.getY(), 10);
	}

	@Test
	public void testToString() 
	{
		p1 = new Point();
		assertEquals(p1.toString(), "(0, 0)");
	}

}

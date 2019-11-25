import static org.junit.Assert.*;

public class RectangleTest {


    @org.junit.Test
    public void getDefaultValues() {
        Rectangle g = new Rectangle();
        assertEquals(1.0, g.width, 0.001);
        assertEquals(1.0, g.height, 0.001);
    }

    @org.junit.Test
    public void test4_40() {
        Rectangle t = new Rectangle(4.0, 40.0);

        assertEquals(4.0, t.width, 0.001);
        assertEquals(40.0, t.height, 0.001);

        assertEquals(160, t.getArea(), 0.001);
        assertEquals(88, t.getPerimeter(), 0.001);

        System.out.println("t width = " + t.width);
        System.out.println("t height = " + t.height);
        System.out.println("t area = " + t.getArea());
        System.out.println("t perimeter = " + t.getPerimeter());
    }

    @org.junit.Test
    public void testDoubles() {
        Rectangle j = new Rectangle(3.5, 35.9);

        assertEquals(3.5, j.width, 0.001);
        assertEquals(35.9, j.height, 0.001);

        assertEquals(125.65, j.getArea(), 0.001);
        assertEquals(78.80, j.getPerimeter(), 0.001);

        System.out.println("t width = " + j.width);
        System.out.println("t height = " + j.height);
        System.out.println("t area = " + j.getArea());
        System.out.println("t perimeter = " + j.getPerimeter());
    }

}
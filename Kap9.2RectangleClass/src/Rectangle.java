
public class Rectangle {

        double height = 1.0;
        double width = 1.0;


        public Rectangle() {

        }

    public Rectangle(double width, double height) {
            this.height = height;
            this.width = width;

    }
    public double getArea() {
            return width * height;

    }
    public double getPerimeter() {
            return width + width + height + height;
    }

}

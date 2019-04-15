package ClassProblem22;

/**
 * Create a Rectangle class with following fields width, height
 * int methods to compute area, check if rectangle is square and two rectangles are equal.
 */

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int setHeight(int height) {
        this.height = height;
        return height;
    }

    public void setValues(int a, int b) {
        width = a;
        height = b;
    }

    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 5);
        Rectangle rec2 = new Rectangle(4, 5);
        int a = rec1.setHeight(7);
        System.out.println("The height is set to: " + a);
        System.out.println("The width is: " + rec1.getWidth());
        System.out.println("The height is: " + rec1.getHeight());

        rec1.setValues(5, 5);
        rec2.setValues(6, 5);
        System.out.println("Area of rectangle1 is: " + rec1.area());
        System.out.println("Area of rectangle2 is: " + rec2.area());
        if (rec1.getWidth() == rec1.getHeight()) {
            System.out.println("The first rectangle is a square");
        }
        if (rec1.area() == rec2.area()) {
            System.out.println("The rectangles are equals");
        } else
            System.out.println("The rectangles are not equals");
    }
}



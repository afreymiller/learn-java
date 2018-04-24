/* Example of abstraction */

abstract class Polygon {
    /* Proper encapsulation */
    private int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public int getNumSides() {
        return sides;
    }
}

class Rectangle extends Polygon {
    
    private double length;
    private double width;
    
    public Rectangle(int numSides, double length, double width) {
        super(numSides);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2*length + 2*width;
    }

}

public class AbstractDemo {
    public static void main(String [] args) {
        /* Rectangle class cannot be instantiated as
        an object directly and can only created by
        extension of the parent class */
        Rectangle r = new Rectangle(4, 2.0, 2.0);
        System.out.println(r.getArea());
    }
}
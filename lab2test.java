class Square implements Polygon {
    private float length;
    private int sides;

    public Square(float length, int sides) {
        this.length = length;
        this.sides= sides;
    }

    public void getArea() {
        System.out.print("The Area of the Square is "+ (length * length)+"\n");
    }

    public void getSides() {
        System.out.printf("I have %d sides \n", sides);
    }
}
class Rectangle implements Polygon {
    private float length;
    private float breadth;
    private int sides;

    public Rectangle(float length, float breadth, int sides) {
        this.length = length;
        this.breadth = breadth;
        this.sides= sides;
    }

    public void getArea() {
        System.out.print("The Area of the rectangle is "+ (length * breadth)+"\n");
    }

    public void getSides() {
        System.out.printf("I have %d sides \n", sides);
    }

}
public class lab2test {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(5,6, 4);
        Square S1 = new Square(5,4);
        R1.getArea();
        R1.getSides();
        S1.getArea();
        S1.getSides();

    }
}

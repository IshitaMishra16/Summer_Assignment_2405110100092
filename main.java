package OOPS4;

// Question 1

interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

class ToTestInt {
    public void displaySquare(int num) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square of " + num + " = " + obj.square(num));
    }
}

// Question 2

class Outer {

    void display() {
        System.out.println("Display method of Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Display method of Inner class");
        }
    }
}

// Question 3

class Point {

    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

// Question 4

class Box {

    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Area = " + area());
    }
}

class Box3D extends Box {

    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    public void displayVolume() {
        System.out.println("Volume = " + volume());
    }
}
public class main {

    public static void main(String[] args) {

        // Question 1

        System.out.println(" Question 1 :");

        ToTestInt test = new ToTestInt();
        test.displaySquare(8);

        //  Question 2 

        System.out.println("\n Question 2 :");

        Outer obj = new Outer();
        obj.display();

        Outer.Inner innerObj = obj.new Inner();
        innerObj.display();

        // Question 3

        System.out.println("\n Question 3 :");

        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setX(15);
        p2.setY(25);
        p2.display();

        p2.setXY(30, 40);
        p2.display();

        //  Question 4 

        System.out.println("\n Question 4 :");

        Box box = new Box(10, 5);
        box.displayArea();

        Box3D box3d = new Box3D(10, 5, 8);
        box3d.displayArea();
        box3d.displayVolume();
    }
}

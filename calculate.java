public class calculate {
    int height;
    int width;
    int radius;
    double pi = 3.14;
    double side;

    public class Rectangle extends calculate
    public void calculate(int l, int w)
    {
    length=l;
    width=w;
    int area = length* width;
    System.out.println("Area of the rectangle is" +area);
    }
    }

    public class Circle extends Shape {
        public void Calculate(int r) {
            r = radius;
            int area = pi * radius * radius;
            System.out.println("Area of the square is" + area);
        }
    }

    public class Square extends Shape {
        public void Calculate(double s) {
            side = s;
            int area = side * side;
            System.out.println("Area of the square is" + area);
        }
    }
}

public class Area1()
{

    public static void main (String args[])
    {
    Rectangle s1 = new Rectangle();
    s1.calculate(5,2);
    Circle s2 = new Circle();
    s2.calculate(10);
    Square s3 = new Square();
    s3.calculate(3);
    }
}

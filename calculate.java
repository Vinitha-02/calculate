public class calculate extends shape {

    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        s1.find1(5, 2);
        Circle s2 = new Circle();
        s2.find2(10);
        Square s3 = new Square();
        s3.find3(4);
    }

}

class shape {
    int length;
    int width;
    int radius;
    double pi = 3.14;
    double side;
}

class Rectangle extends shape {
    void find1(int l, int w) {
        length = l;
        width = w;
        int area = length * width;
        System.out.println("Area of the rectangle is" + area);
    }
}

class Circle extends shape {
    public void find2(int r) {
        r = radius;
        double area = pi * radius * radius;
        System.out.println("Area of the square is" + area);
    }
}

class Square extends shape {
    public void find3(double s) {
        side = s;
        double area = side * side;
        System.out.println("Area of the square is" + area);
    }
}

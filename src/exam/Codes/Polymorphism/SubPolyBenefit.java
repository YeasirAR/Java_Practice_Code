package AI;

class Shape {
    void draw() {
        System.out.println("Drawing a random shape");
    }
}
class Triangle extends Shape {
    private int a;
    void draw() {
        System.out.println("Drawing a triangle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class IsoscelesTriangle extends Triangle {
    void draw() {
        System.out.println("Drawing an isosceles triangle");
    }
}
class Square extends Rectangle {
    void draw() {
        System.out.println("Drawing a square");
    }
}
public class SubPolyBenefit {
    public static void main(String[] args) {
        draw(new Triangle());
        draw(new Rectangle());
        draw(new IsoscelesTriangle());
    }
//    static void draw(Triangle triangle) {
//        triangle.draw();
//    }
//    static void draw(IsoscelesTriangle isoscelesTriangle) {
//        isoscelesTriangle.draw();
//    }
//    static void draw(Rectangle rectangle) {
//        rectangle.draw();
//    }
    static void draw(Shape shape) {
        shape.draw();
    }
}

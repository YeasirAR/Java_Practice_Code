package exam.oop_lab;


class Shape{
    void draw(){
        System.out.println("Drawing an unknown shape.");
    }

}

class Circle extends Shape {
    void draw(){
        System.out.println("Drawing a Circle.");
    }

}
class Triangle extends Shape {
    void draw(){
        System.out.println("Drawing a Triangle.");
    }

}

class Test{
    void testDraw(Shape s){
        s.draw();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testDraw(new Shape());
        t.testDraw(new Circle());
        t.testDraw(new Triangle());
    }
}

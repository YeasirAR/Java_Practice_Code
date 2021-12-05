package lecture4;

class Base {
    int a;
    Base(int a) {
        System.out.println("kjfbjdk");this.a = a;
    }
    void show() {
        System.out.println(a);
    }
}

class Override extends Base {
    int b;
    Override(int a, int b) {
        super(a);
        System.out.println("Override's constructor");
        this.b = b;
    }
    // the following method overrides Base class's show()
    void show() {
        System.out.println(a + ", " + b);
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Override o = new Override(10, 20);
        o.show();
    }
}

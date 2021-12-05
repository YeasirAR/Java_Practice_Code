package lecture2;

class Animal {
    String name;
    int age;
    boolean hasTail;

    void eat() {
        System.out.println(name + " is eating...");
    }

    void bark() {
        System.out.println(name + " is barking...\n");
    }

    void printMyDetail() {
        System.out.println("Name: " + name + " Age: " + age + " Has Tail? " + hasTail);
    }
}

public class ClassDemo {
    public static void main(String[] args) {

        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal parrot = new Animal();

        dog.name = "Rocket";
        dog.age = 5;
        dog.hasTail = true;
        dog.printMyDetail();
        dog.eat();
        dog.bark();

        cat.name = "Ms. Whiskerson";
        cat.age = 2;
        cat.hasTail = true;
        cat.printMyDetail();
        cat.eat();
        cat.bark();

        parrot.name = "Coco";
        parrot.age = 1;
        parrot.hasTail = false;
        parrot.printMyDetail();
        parrot.eat();
        parrot.bark();

    }
}

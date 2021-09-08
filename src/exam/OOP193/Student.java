package exam.OOP193;

class Student {
    public void study() {
        System.out.println("Student is studying");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();
        Student adnan = new Student(){
            public void study() {
                System.out.println("Adnan is studying");
            }
        };
        adnan.study();
    }
}
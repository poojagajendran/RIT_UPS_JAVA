class Person {
    String name = "Parent";
}

class Task8 extends Person {
    String name = "Child";

    void display() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + this.name);
    }

    public static void main(String[] args) {
        Task8 s = new Task8();
        s.display();
    }
}

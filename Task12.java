class Parent {
    Parent(int x) {
        System.out.println(x);
    }
}

class Task12 extends Parent {
    Task12() {
        super(10);
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Task12 c = new Task12();
    }
}
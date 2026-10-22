class A {
    A() {
        System.out.println("A");
    }
}

class Task11 extends A {
    Task11() {
        this(10);
        System.out.println("B default");
    }

    Task11(int x) {
        super();
        System.out.println("B parameterized");
    }

    public static void main(String[] args) {
        new Task11();
    }
}
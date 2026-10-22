class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Task7 extends Animal {
    Task7() {
        super();
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {
        Task7 d = new Task7();
    }
}
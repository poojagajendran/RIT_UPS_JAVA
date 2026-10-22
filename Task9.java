class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Task9 extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Car starts");
    }

    public static void main(String[] args) {
        Task9 c = new Task9();
        c.start();
    }
}
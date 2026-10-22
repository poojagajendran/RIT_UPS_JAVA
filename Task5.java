class Task5 {
    String brand;
    int price;

    Task5() {
        this("Samsung", 15000);
    }

    Task5(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Task5 m = new Task5();
        m.display();
    }
}
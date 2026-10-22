class Task3 {
    String title;
    double price;

    Task3() {
        title = "Unknown";
        price = 0;
    }

    Task3(String title) {
        this.title = title;
        price = 0;
    }

    Task3(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }

    public static void main(String[] args) {
        Task3 b1 = new Task3();
        Task3 b2 = new Task3("Java");
        Task3 b3 = new Task3("Python", 500);

        b1.display();
        b2.display();
        b3.display();
    }
}

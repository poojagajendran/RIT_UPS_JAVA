class Task4 {
    String name;

    Task4(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Task4 s = new Task4("Priya");
        s.display();
    }
}
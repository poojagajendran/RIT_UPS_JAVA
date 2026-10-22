class task2 {
    int id;
    String name;
    double salary;

    task2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        task2 e = new task2(101, "Arun", 25000);
        e.display();
    }
}
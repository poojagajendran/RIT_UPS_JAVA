class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Task10 extends Person {
    double salary;

    Task10(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Task10 e = new Task10("Kumar", 35000);
        e.display();
    }
}
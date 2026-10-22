class Task6 {
    Task6 getObject() {
        return this;
    }

    void display() {
        System.out.println("Calculator method called");
    }

    public static void main(String[] args) {
        Task6 c = new Task6();
        c.getObject().display();
    }
}

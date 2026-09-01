class Student {
    String name;
    int roll;
    float fee;
    String address;

    Student(String name, int roll, float fee, String address) {
        this.name = name;
        this.roll = roll;
        this.fee = fee;
        this.address = address;
    }

    void display() {
        System.out.println(name + " " + roll + " " + fee + " " + address+" ");
    }
}

class Hard3 {
    public static void main(String args[]) {
        Student s1 = new Student("rahul", 100, 2000f, "Bdk");
        Student s2 = new Student("raj", 200, 3000f, "Bls");
        Student s3 = new Student("ram", 300, 4000f, "Bbsr");

        s1.display();
        s2.display();
        s3.display();
    }
}
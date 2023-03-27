public class Person {

    String name;
    int age;
    void displayInfo() {
        System.out.printf("Name: %s,\t Age: %d\n", name, age);
    }

    Person() {
        this("NoName", 18);
    }

    Person(String n) {
        this(n, 18);
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

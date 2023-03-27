public class Person {

    String name;
    int age;
    void displayInfo() {
        System.out.printf("Name: %s,\t Age: %d\n", name, age);
    }

    Person() {
        name = "NoName";
        age = 18;
    }

    Person(String n) {
        name = n;
        age = 18;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

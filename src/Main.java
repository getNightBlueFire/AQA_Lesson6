public class Main {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 26);
        sam.displayInfo();

    }
}
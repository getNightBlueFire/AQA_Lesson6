public class Cat {
    String name;
    int age;
    int isHungry;

    boolean feed(int count) {
        isHungry = isHungry + count;
        if (isHungry > 100) {
            return true;
        } else {
            return false;
        }
    }
}

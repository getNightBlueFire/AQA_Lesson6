import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] people = new Student[14];
        for (int i = 0; i < people.length; i++) {
            String name = sc.nextLine();
            String group = sc.nextLine();
            float rate = sc.nextFloat();
            Student student = new Student(name, group, rate);
            people[i] = student;
        }

        System.out.println(Arrays.toString(people));

    }
}
import java.util.Random;

public class Student {
    String name;
    String group;
    int rate;
    Random r = new Random();
    public Student(String name) {
        this.name = name;
        this.group = "AQA_Lesson6";
        this.rate = r.nextInt(1,11);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }
}

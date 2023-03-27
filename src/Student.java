public class Student {
    String name;
    String group;
    float rate;

    public Student(String name, String group, float rate) {
        this.name = name;
        this.group = group;
        this.rate = rate;
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
